package com.example.lab1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CountServlet", value = "/CountServlet")
public class CountServlet extends HttpServlet {
    int count = 0;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        count++;
        out.println("<html><body>");
        out.println("<h1>" + "I Am from default constructor"+ "</h1>");
        out.println("<h1>" +"Since loading ,this servlet has been accessed " +
                count +" times"+"</h1>");
        out.println("<h1>" + "HeZhihao 2020211001001115"+ "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request,response);
    }
}
