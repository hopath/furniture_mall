package com.hopath.furns.web;

import com.hopath.furns.entity.Furn;
import com.hopath.furns.service.impl.FurnServletImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnServlet extends BasicServlet {
    FurnServletImpl furnServlet = new FurnServletImpl();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void addFurn(HttpServletRequest request, HttpServletResponse response) throws SQLException {
        String name = request.getParameter("name");
        System.out.println(name);
        if(!furnServlet.isExistName(name)){
            String maker = request.getParameter("maker");
            System.out.println(maker);
            String price = request.getParameter("price");
            String sales = request.getParameter("sales");
            String stock = request.getParameter("stock");
            Furn furn = new Furn(name, maker, price, sales, stock);
            furnServlet.addFurn(furn);
            System.out.println("添加成功...");
        }else{
            System.out.println("用户名已存在...");
        }
    }

    public void deleteFurn(HttpServletRequest request, HttpServletResponse response){

    }

    public void updateFurn(HttpServletRequest request, HttpServletResponse response){

    }

    public void showAllFurn(HttpServletRequest request, HttpServletResponse response){

    }
}
