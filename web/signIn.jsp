<%-- 
    Document   : signIn
    Created on : Sep 27, 2019, 8:30:29 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <link href="Css/Kfms_style.css" rel="stylesheet" type="text/css"/>
   
    </head>
    <body>
      <%@include file="header.jsp" %>
        <%@include file="main-menu.jsp" %>
        <div style="width: 50%; margin-left: 25%; margin-top: 5%">
         <h1>Signin Form</h1>
            
            <%
                String msg = request.getParameter("msg");
                if (msg != null) {
            %>
            <h1><%=msg%></h1>
            <%}%>
            <form action="AdminServlet" method="post">
                <input class="field" type="text" name="email" placeholder="Enter username" autofocus="" required=""/>
                <input class="field" type="password" name="pwd" placeholder="Enter password" required=""/>
                <input type="submit" value="Signin"/>
            </form>
        </div>
    </body>
</html>
