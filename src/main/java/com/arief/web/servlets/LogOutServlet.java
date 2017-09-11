package com.arief.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LogOutServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("user-name")!=null){
            req.getSession().invalidate();
            resp.sendRedirect("/belajar-filter-session/auth/login.jsp");
        }else{
            resp.sendRedirect("/belajar-filter-session/auth/login.jsp");
        }
    }

}
