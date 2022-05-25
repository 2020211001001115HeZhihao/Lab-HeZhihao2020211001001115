package com.example.lab2;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "LoginFilter",urlPatterns = {"/lab2/validate.jsp","/lab2/welcome.jsp"})
public class LoginFilter implements Filter {
    public void init(FilterConfig config) throws ServletException {

        System.out.println("i am LoginFilter--init()");
    }

    public void destroy() {

        System.out.println("i am LoginFilter--destroy()");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {

//        HttpServletRequest req = (HttpServletRequest) request;
//        HttpServletRequest res = (HttpServletRequest) response;
//        HttpSession session = req.getSession();
//        if(session.getAttribute("") == null){
//            req.getRequestDispatcher("lab2/login.jsp");
//        } else req.getRequestDispatcher("lab2/welcome.jsp");
        System.out.println("i am LoginFilter--before chain");
        chain.doFilter(request, response);
        System.out.println("i am LoginFilter--after chain");
    }
}
