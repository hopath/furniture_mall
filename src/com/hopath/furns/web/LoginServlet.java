package com.hopath.furns.web;

import com.hopath.furns.entity.Member;
import com.hopath.furns.service.impl.MemberServiceImpl;

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
    MemberServiceImpl memberService = new MemberServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("user-name");
        String passWd = request.getParameter("user-password");

        try {
            response.setContentType("text/html;charset=utf-8");
            request.setAttribute("username", username);
            if(!memberService.isExistUsername(username)){
                request.setAttribute("key", "用户名不存在...");
                request.getRequestDispatcher("views/member/login.jsp").
                        forward(request, response);
            }else{
                Member member = new Member(username, passWd);
                if(memberService.login(member) == null){
                    request.setAttribute("key", "密码错误...");
                    request.getRequestDispatcher("views/member/login.jsp").
                            forward(request, response);
                }else {
                    request.getRequestDispatcher("/views/member/login_ok.html").
                            forward(request, response);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
