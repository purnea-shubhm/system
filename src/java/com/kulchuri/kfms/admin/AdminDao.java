package com.kulchuri.kfms.admin;

import com.duplexTree.Db.ConnectionDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDao {

    private Connection conn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    public AdminDao() {
    }

    public boolean adminLogin(String email, String pwd) {
        boolean flag = false;
        if (conn == null) {
            conn = ConnectionDb.conn();
        }
        try {
            String query = "select aid from admin_login where email=? and pwd=?";
            ps = conn.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pwd);
            System.out.println(ps);
            rs = ps.executeQuery();
            if (rs.next()) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("EXception at adminLogin():" + e);
        } finally {
            rs = null;
            ps = null;
            conn = null;
            return flag;
        }
    }
    public void resetPwd(String email, String pwd) {

        if (conn == null) {
            conn =ConnectionDb.conn();
        }
        try {
            String query = "update admin_login set pwd=? where email=?";
            ps = conn.prepareStatement(query);
            ps.setString(2, email);
            ps.setString(1, pwd);
            ps.executeUpdate();

        } catch (Exception e) {
            System.out.println("EXception at resetPwd():" + e);
        } finally {

            ps = null;
            conn = null;

        }
    }
}
