package com.study.d25_db.crud;

import com.study.d25_db.ConnectionDerby;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read {
    public static void main(String[] args) {
        String sql = "SELECT id, age, name FROM Student";
        try(Connection conn = ConnectionDerby.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            
            
            
        } catch (Exception e) {
        }
    }
}
