<%-- 
    Document   : viewAllEntry.jsp
    Created on : May 5, 2020, 11:44:52 PM
    Author     : India
--%>

<%@page import="com.duplexTree.project.Dto.EntryDto"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.duplexTree.project.Dao.EntryDao"%>
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
        <div>

            <h1 style="margin: 1%">List of Entry</h1>
            <table border="1px" id="customers">
                <tr>


                    <th> S.NO</th>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>Mobile No.</th>

                    <th>Gender</th>
                    <th>Purpose of Meting</th>
                    <th>Date</th>
                    <th>Photo</th>
                    <!--<th>Action</th>-->
              
               
                </tr>
                <%
                    EntryDao dao= new EntryDao();
                    
                    ArrayList<EntryDto> al= dao.viewAllEntry();
                    if(al!=null)
                    {
                        int s=1;
                        for(EntryDto dto : al){
                    
                
                %>
                shubham
               
                
                <tr>
                     <td><%=s++%></td>
                <td><%=dto.getFname()%></td>
                <td><%=dto.getLname()%></td>
                <td><%=dto.getEmail()%></td>
                <td><%=dto.getMno()%></td>
                <td><%=dto.getGender()%></td>
                <td><%=dto.getEpur()%></td>
                <td><%=dto.getEdate()%></td>
                <td>
                    <img src="data:image/jpeg;base64,<%=dto.getPhoto()%>" width="50" height="50">
                </td>
                    
                    
                </tr>
                <%
                 }
               }
                %>
                
            </table>

              
        </div>
    </body>
</html>
