package com.kulchuri.kfms.admin;


import com.kulchuri.Utility.KFMSPassword;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet(urlPatterns = {"/AdminServlet"})
public class AdminServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        try {
            String email = request.getParameter("email");
            String pwd = request.getParameter("pwd");
            String opn = request.getParameter("opn");
            HttpSession session = request.getSession();
            if (opn != null && opn.equals("Reset")) {
                new AdminDao().resetPwd((String) session.getAttribute("email"), KFMSPassword.encrypt(pwd));
                response.sendRedirect("adminHome.jsp");
            } else {
                if (new AdminDao().adminLogin(email, KFMSPassword.encrypt(pwd))) {
//                Handle Session Tracking
//              store data into session scope
                    session.setAttribute("email", email);
                    response.sendRedirect("adminHome.jsp");
                } else {
                    response.sendRedirect("signIn.jsp?msg=Please Enter Valid Login Details");
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
