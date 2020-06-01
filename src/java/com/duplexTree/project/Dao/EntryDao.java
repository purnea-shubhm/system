/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.duplexTree.project.Dao;

import com.duplexTree.Db.ConnectionDb;
import com.duplexTree.project.Dto.EntryDto;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Base64;

/**
 *
 * @author India
 */
public class EntryDao {
    private Connection conn=null;
    private PreparedStatement ps=null;
  private ResultSet rs=null;
    public EntryDao() {
    }
    
    public boolean addEntry(EntryDto dto,InputStream photo){
    boolean flag=false;
    if(conn==null)
        conn=ConnectionDb.conn();
        try {
            String sql="insert into clgentry(fname, lname, email, mno, gender, epur, edate,photo) values(?,?,?,?,?,?,?,?)";
            ps=conn.prepareCall(sql);
            ps.setString(1, dto.getFname());
            ps.setString(2, dto.getLname());
            ps.setString(3, dto.getEmail());
            ps.setString(4, dto.getMno());
            ps.setString(5, dto.getGender());
            ps.setString(6,dto.getEpur());
            ps.setString(7,dto.getEdate());
            ps.setBlob(8, photo);
                    
            if(ps.executeUpdate()>0)
            {
                flag=true;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception caught at addDriver() : "+e);
        }
    finally{
        ps=null;
        conn=null;
         return flag;
        }
   
    }
    
     public ArrayList<EntryDto> viewAllEntry() {
        ArrayList<EntryDto> al = new ArrayList<>();
//    boolean flag=false;
        if (conn == null) {
            conn = ConnectionDb.conn();
        }
        try {
             ps = conn.prepareCall("select * from clgentry");
            rs = ps.executeQuery();
           
            while (rs.next()) {
                EntryDto dto = new EntryDto();
                dto.setEid(rs.getInt("eid"));
                dto.setFname(rs.getString("fname"));
                dto.setLname(rs.getString("lname"));
//                dto.setBid(rs.getInt("bid"));
                dto.setEmail(rs.getString("email"));
                dto.setMno(rs.getString("mno"));
                dto.setGender(rs.getString("gender"));
                dto.setEpur(rs.getString("epur"));
                dto.setEdate(rs.getString("edate"));

                Base64.Encoder encoder = Base64.getEncoder();
                String photo = encoder.encodeToString(rs.getBytes("photo"));
                dto.setPhoto(photo);

                al.add(dto);

            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception at viewAllEntry() DAo: " + e);
        } finally {
            conn = null;
            return al;

        }

    }
     
     
     public EntryDto getStudent(int eid) {
        EntryDto dto = null;

        if (conn == null) {
            conn = ConnectionDb.conn();
        }
        try {
            String sql = "select * from clgentry where eid=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1, eid);
            rs = ps.executeQuery();
            if (rs.next()) {
                dto = new EntryDto();
                dto.setEid(rs.getInt("eid"));
                dto.setFname(rs.getString("fname"));
                dto.setLname(rs.getString("lname"));
                dto.setEmail(rs.getString("email"));
                dto.setMno(rs.getString("mno"));
                dto.setGender(rs.getString("gender"));;
                   dto.setEpur(rs.getString("epur"));
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception caught at getEntry() Dao: " + e);
        } finally {
            rs = null;
            ps = null;
            conn = null;
            return dto;
        }
    }

}
