package com.ivoyant.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
    public static void main(String[] args) {
        String url="jdbc:mysql://localhost:3306/STUDENTS";
        String uname="root";
        String pass="tiger";
        String query="DELETE FROM STUDENT WHERE SID=4";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection(url,uname,pass);
            Statement st=con.createStatement();
            int res=st.executeUpdate(query);

            con.close();

        } catch (ClassNotFoundException | SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
