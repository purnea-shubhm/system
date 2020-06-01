<%-- 
    Document   : contact
    Created on : Sep 27, 2019, 8:28:47 PM
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
        <!--<a href="header.jsp"></a>-->
        <%@include file="header.jsp" %>
        <%@include file="main-menu.jsp" %>
        <div  style="float: right">            <iframe src="https://www.google.com/maps/embed?pb=!1m14!1m8!1m3!1d14663.084390773694!2d77.5247039!3d23.2514153!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x0%3A0xda9256bd4f4eb44b!2sLakshmi%20Narain%20College%20Of%20Technology!5e0!3m2!1sen!2sin!4v1570723882837!5m2!1sen!2sin" width="600" height="450" frameborder="0" style="border:0;" allowfullscreen=""></iframe>
        </div>
        <div style="width: 50%; border-style: solid; border-color: #ff0033; margin-top: 2%; margin-left: 2%">
            <h2>Send FeedBack</h2><br><br>
            <form action="contact.jsp" method="post">
                Name:<br>
                <input class="field" type="text" name="name"><br>
                E-mail:<br>
                <input class="field" type="text" name="mail"><br>
                Comment:<br>
                <input class="field" type="text" name="comment" size="50"><br><br>
                <input type="submit" value="Send">
                <!--<input type="reset" value="Reset">-->
            </form>
        </div>
    </body>
</html>
