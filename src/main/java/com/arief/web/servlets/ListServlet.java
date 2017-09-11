package com.arief.web.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListServlet extends HttpServlet {





    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");


       StringBuilder html = new StringBuilder();



       html.append("<html>");
       html.append("<head>" +
               "<title>List Data</title>" +
               "" +
               "<style>" +
               "    table" +
               "    {" +
               "    " +
               " clear:both;   " +
               "    " +
               "    " +
               "    }" +
               "" +
               "   div{clear:both;}" +
               "   " +
               "</style>" +
               "" +
               "</head>");
       html.append("<body>" +
               "    <form action=\"/belajar-filter-session/log-out\">\n" +
               "        <input type=\"submit\" value=\"Log Out\" style=\"float: right; margin: 0.5%; padding : 1%\";/>\n" +
               "    </form>" +
               "" +
               "" +
               "<table>" +
               "<tr>" +
               "    <td>No</td>" +
               "    <td>Nama Barang</td>" +
               "</tr>" +
               "" +
               "<tr>" +
               "    <td>1</td>" +
               "    <td>Barang A</td>" +
               "</tr>" +
               "" +
               "<tr>" +
               "    <td>2</td>" +
               "    <td>Barang B</td>" +
               "" +
               "</tr>" +
               "" +
               "<tr>" +
               "    <td>3</td>" +
               "    <td>Barang C</td>" +
               "</tr>" +
               "" +
               "</table><br/>" +
               "" +
               "<div>" +
               "" +
               "" +
               "</div>" +
               "<a href='/belajar-filter-session/menu/Home.jsp'>" +
               "Home page" +
               "</a>" +
               "</body>");


       resp.getWriter().write(html.toString());




    }
}
