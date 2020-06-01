<%-- 
    Document   : Entry
    Created on : May 3, 2020, 6:05:18 PM
    Author     : India
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
       <%@include file="main-menu.jsp" %>
        <%--<%@include file="admin_menu.jsp" %>--%>
        <!--<div style="width: 50%; margin-left: 25%; margin-top: 1%">-->
            
            
             <form style="margin-top: 3%"  action="entry" method="post" enctype="multipart/form-data">
                 <%--<%@include file="header.jsp" %>--%>
            <%--<%@include file="admin_menu.jsp" %>--%>
            <div style="width: 50%; margin-left: 25%">
            <form style="margin-top: 3%" >
                <input class="field" type="text" name="fname" placeholder="Enter first name" required=""/><br>
                <input class="field" type="text" name="lname" placeholder="Enter last name" required=""/><br>
                <input class="field" type="email" name="email"placeholder="Enter Email Id" required=""/><br>
                <input class="field" type="text" name="mno"placeholder="Enter Mobile number" required=""/><br>
                <input class="field" type="text" name="gender" placeholder="Enter gender" required=""/><br>
                <!--<input class="field" type="file" name="photo"placeholder="Upload image" required=""/><br>-->
                
                <!--<input class="field"  type="text" name="add"placeholder="Enter your address"/><br>-->
                <input class="field"  type="text" name="epur"placeholder="Enter Purpose of meeting"/><br>
                <input class="field" type="text" name="edate" placeholder="Enter date " required=""/><br>
                <input class="field" type="file" name="photo"placeholder="upload photo"/><br>
                <input  class="field" type="submit" value="submit">
                </div>
            </form>
        <!--</div>-->
        
    </body>
</html>
