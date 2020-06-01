<%
//    Track session For Admin
    String email = (String) session.getAttribute("email");
    if (email == null) {
        response.sendRedirect("signIn.jsp");
    }%>



<ul>
    <li><a href="adminHome.jsp">Home</a></li>
   
    <li>  <a href="viewAllEntry.jsp">View All Entry</a></li>
    <li><a href="adminResetPwd.jsp">Reset Password</a></li>
    <li><a href="signout.jsp">Sign Out</a></li>
</ul>