package com.hopath.furns.web;

import com.hopath.furns.dao.impl.MemberDAO;
import com.hopath.furns.entity.Member;
import com.hopath.furns.service.impl.MemberService;

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
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("user-name");
        String password = request.getParameter("user-password");
        String email = request.getParameter("user-email");
        Member member = new Member(username, password, email);
        MemberService memberService = new MemberService();
        try {
            response.setContentType("text/html;charset=utf-8");
            int i = new MemberDAO().saveMember(member);
            if(i > 0){
                response.getWriter().write("<h1>注册成功<h1>");
            }else{
                response.getWriter().write("<h1>注册失败<h1>02");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
