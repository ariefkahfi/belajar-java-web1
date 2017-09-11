package com.arief.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class AuthServlet extends HttpServlet {



    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");


        req.getSession().setAttribute("user-name",username);
        req.getSession().setAttribute("user-pass",password);



        resp.sendRedirect("/belajar-filter-session/menu/Home.jsp");


    }




}
