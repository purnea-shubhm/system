
<%   
    request.getSession().removeAttribute("email");
    response.sendRedirect("index.jsp");
%>