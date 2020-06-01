<%-- 
    Document   : adminResetPwd
    Created on : Oct 10, 2019, 10:00:40 PM
    Author     : hp
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
       
        <link href="Css/Kfms_style.css" rel="stylesheet" type="text/css"/>
   
    </head>
    <body>
        <%@include file="header.jsp" %>
        <%@include file="admin_menu.jsp" %>
        <div style="width: 50%; margin-left: 25%; margin-top: 5%">
            <h1>Reset Password Form</h1>
            <form action="AdminServlet" method="post">
                <input  class="field" type="password" name="pwd" required="" placeholder="Eneter new password to reset"/>
                <input type="submit" value="Reset" name="opn"/>
            </form>
        </div>

    </body>
</html>
