package com.example.lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyDearJspServlet", value = "/MyDearJspServlet")
public class MyDearJspServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        String name = req.getParameter("name");
        String cla = req.getParameter("class");
        String id = req.getParameter("id");
        out.println("name: " + name + "<br>");
        out.println("class: " + cla + "<br>");
        out.println("ID: "+id + "<br>");
        out.println("submit: Send data to server" + "<br>");
        out.println("HeZhihao2020211001001115");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
