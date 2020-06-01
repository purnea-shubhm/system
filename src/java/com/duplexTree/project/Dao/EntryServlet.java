/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duplexTree.project.Dao;

import com.duplexTree.project.Dto.EntryDto;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author India
 */
@WebServlet(urlPatterns = {"/entry"})
@MultipartConfig(maxFileSize = 98989999)
public class EntryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        try {
            String fname=req.getParameter("fname");
            String lname=req.getParameter("lname");
            String email=req.getParameter("email");
            String mno=req.getParameter("mno");
            String gender=req.getParameter("gender");
            String epur=req.getParameter("epur");
            String date=req.getParameter("edate");
             Part part = req.getPart("photo");
            InputStream photo = part.getInputStream();

            EntryDto dto= new EntryDto();
            dto.setFname(fname);
            dto.setLname(lname);
            dto.setEmail(email);
            dto.setMno(mno);
            dto.setGender(gender);
            dto.setEpur(epur);
            dto.setEdate(date);
            EntryDao dao= new EntryDao();
            boolean f=dao.addEntry(dto, photo);
             PrintWriter pw = resp.getWriter();
             if (f) {
                pw.print("sucess");
            } else {
                pw.print("failed");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Failed Entry() : "+e);
        }
    
    }
    
   
}
