<%@ page import="com.example.lab2.Login" %>
<%@ page import="java.util.Objects" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 5/15/2021
  Time: 11:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>validate</title>
</head>
<body>
<%--Todo 1: Use <jsp:useBean> to create a Login bean instance in request scope --%>
<jsp:useBean id="login" class="com.example.lab2.Login" scope="request"></jsp:useBean>
    <%--Todo 2: Use <jsp:setProperty> to set  beans' property username and password--%>
<jsp:setProperty name="login" property="*"></jsp:setProperty>
<%

    request.setAttribute("username",login.getUsername());
    if(Objects.equals("admin",login.getUsername()) && Objects.equals("admin",login.getPassword())){
        session.setAttribute("admin","admin");
        request.getRequestDispatcher("welcome.jsp").forward(request,response);
    }

   //todo 3: use if check username is admin and ppassword is admin
%>
    <%--todo 4: use jsp:forward to welcome.jsp page--%>

    <%--todo 5: else part{ --%>

<%
// todo 6: print username or password error message
    out.println("username or password error message");
%>
<form action="validate.jsp">
    Username : <input type="text" name="username"><br>
    Password : <input type="password" name="password"><br>
    <input type="submit" value="Login"/>
</form>
    <%--todo 7: use jsp:include login.jsp page --%>

    <%--todo 8: close else --%>

</body>
</html>