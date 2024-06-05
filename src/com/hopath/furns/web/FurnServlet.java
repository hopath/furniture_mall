package com.hopath.furns.web;

import com.hopath.furns.entity.Furn;
import com.hopath.furns.service.impl.FurnServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.util.List;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnServlet extends BasicServlet {
    FurnServiceImpl furnService = new FurnServiceImpl();

    public void addFurn(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        String name = request.getParameter("name");
        if(!furnService.isExistName(name)){
            String maker = request.getParameter("maker");
            System.out.println(maker);
            BigDecimal price = BigDecimal.valueOf(Double.parseDouble(request.getParameter("price")));
            Integer sales = Integer.parseInt(request.getParameter("sales"));
            Integer stock = Integer.parseInt(request.getParameter("stock"));
            Furn furn = new Furn(name, maker, price, sales, stock, "assets/images/product-image/10.jpg");
            if(furnService.addFurn(furn)){
                response.sendRedirect(request.getContextPath() + "/manage/FurnServlet?action=showAllFurn");
            }else {
                System.out.println("添加失败...");
            }
        }else{
            System.out.println("家具已存在...");
            response.sendRedirect(request.getContextPath() + "/manage/FurnServlet?action=showAllFurn");
        }
    }

    public void deleteFurn(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String name = request.getParameter("name");
        if(furnService.isExistName(name)){
            Furn furn = new Furn();
            furn.setName(name);
            furnService.deleteFurn(furn);
            System.out.println("删除成功...");
        }else{
            System.out.println("家具不存在...");
        }
    }

    public void updateFurn(HttpServletRequest request, HttpServletResponse response){

    }

    public void showAllFurn(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Furn> allFurn = furnService.getAllFurn();
        request.setAttribute("furns", allFurn);
        request.getRequestDispatcher("/views/furn/furn_manage.jsp").
                forward(request, response);
    }
}
