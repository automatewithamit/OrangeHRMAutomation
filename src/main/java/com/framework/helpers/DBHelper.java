package com.framework.helpers;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class DBHelper {
    /*
    PropertiesHelper dbConfigProperties = new PropertiesHelper("//resources//db-config.properties");

    public Map<String, String> readLoginTable() {
        Map<String, String> loginData = new HashMap<String, String>();

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName(getJDBC_DRIVER());

            conn = DriverManager.getConnection(getDB_URL(), getUser(),getPASS());

            stmt = conn.createStatement();
            String sql = "SELECT username, password FROM login";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                String username = rs.getString("username");
                String password = rs.getString("password");
                loginData.put("username", username);
                loginData.put("password", password);
                System.out.println("Username from DB: " + username + ", Password from DB: " + password);
            }

            rs.close();
            stmt.close();
            conn.close();
            return loginData;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (stmt != null)
                    stmt.close();
            } catch (Exception se2) {
            }
            try {
                if (conn != null)
                    conn.close();
            } catch (Exception se) {
                se.printStackTrace();
            }
            return loginData;
        }
    }


    public String getJDBC_DRIVER() {
        return dbConfigProperties.getProperty("JDBC_DRIVER");
    }
    public String getDB_URL() {
        return dbConfigProperties.getProperty("DB_URL");
    }
    public String getUser() {
        return dbConfigProperties.getProperty("USER");
    }
    public String getPASS() {
        return dbConfigProperties.getProperty("PASS");
    }

     */
}
