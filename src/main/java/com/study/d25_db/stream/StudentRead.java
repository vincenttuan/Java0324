package com.study.d25_db.stream;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentRead {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:derby://localhost:1527/sample";
        String username = "app";
        String password = "app";
        
        try(Connection conn = DriverManager.getConnection(url, username, password);
            Statement stmt = conn.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
            ResultSet rs = stmt.executeQuery("SELECT id, age, name FROM Student"); ) {
            
            
            
        } catch (Exception e) {
        }
    }
}
