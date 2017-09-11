package com.arief.web.filters;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class UserFilter implements Filter {


    ServletContext context;

    public void init(FilterConfig filterConfig) throws ServletException {
       context = filterConfig.getServletContext();


       context.log("Init Filter");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        context.log("before processing");



        HttpServletRequest httpRequest = (HttpServletRequest)servletRequest;

        HttpSession sesi = httpRequest.getSession();


        context.log("user-name :" + sesi.getAttribute("user-name"));

        if(sesi.getAttribute("user-name")==null){
            HttpServletResponse resp = (HttpServletResponse)servletResponse;
            resp.sendError(HttpServletResponse.SC_FORBIDDEN);
        }else{
            filterChain.doFilter(servletRequest,servletResponse);
        }



        context.log("after processing");
    }

    public void destroy() {
        context.log("Destroy Filter");
    }
}
