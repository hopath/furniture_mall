package com.hopath.furns.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 张志伟
 * @version 1.0
 */
public class FurnServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    public void addFurn(HttpServletRequest request, HttpServletResponse response){

    }

    public void deleteFurn(HttpServletRequest request, HttpServletResponse response){

    }

    public void updateFurn(HttpServletRequest request, HttpServletResponse response){

    }

    public void showAllFurn(HttpServletRequest request, HttpServletResponse response){

    }
}
