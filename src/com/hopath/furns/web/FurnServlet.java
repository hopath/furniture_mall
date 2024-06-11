package com.hopath.furns.web;

import com.hopath.furns.entity.Furn;
import com.hopath.furns.service.FurnService;
import com.hopath.furns.service.impl.FurnServiceImpl;
import com.hopath.furns.utils.DataUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
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
            //将参数注入javaBean
            Furn furn = DataUtils.copyParamToBean(request.getParameterMap(), new Furn());

            if(furnService.addFurn(furn)){
                //防止刷新浏览器后重复添加
                response.sendRedirect(request.getContextPath() + "/manage/FurnServlet?action=showAllFurn");
            }else {
                request.setAttribute("meg", "添加失败...");
                request.getRequestDispatcher("/views/furn/furn_add.jsp")
                        .forward(request, response);
            }
        }else{
            request.setAttribute("meg", "家具已存在...");
            request.getRequestDispatcher("/views/furn/furn_add.jsp")
                    .forward(request, response);
        }
    }

    public void deleteFurn(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException, ServletException {
        String name = request.getParameter("name");
        if(furnService.isExistName(name)){
            Furn furn = new Furn();
            furn.setName(name);
            furnService.deleteFurn(furn);
            //防止刷新浏览器后重复删除
            response.sendRedirect(request.getContextPath() + "/manage/FurnServlet?action=showAllFurn");
        }else{
            request.setAttribute("meg", "家具不存在...");
            request.getRequestDispatcher("/views/furn/furn_manage.jsp")
                    .forward(request, response);
        }
    }

    public void updateFurn(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
        Furn furn = DataUtils.copyParamToBean(request.getParameterMap(), new Furn());
        if(furnService.updateFurn(furn, furn.getName())){
            //防止刷新浏览器后重复更新
            response.sendRedirect(request.getContextPath() + "/manage/FurnServlet?action=showAllFurn");
        }
    }

    public void showAllFurn(HttpServletRequest request, HttpServletResponse response) throws SQLException, ServletException, IOException {
        List<Furn> allFurn = furnService.getAllFurn();
        request.setAttribute("furns", allFurn);
        request.getRequestDispatcher("/views/furn/furn_manage.jsp").
                forward(request, response);
    }
}
