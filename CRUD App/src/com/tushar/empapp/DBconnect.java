package com.tushar.empapp;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnect {
    static Connection con;
    public static Connection createDBConnection(){

        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //get connection
            String url = "jdbc:mysql://localhost:3306/employeeDB?useSSl=false";
            String username = "root";
            String password = "root@1234";
            con=DriverManager.getConnection(url, username, password);

        }catch (Exception ex){
            ex.printStackTrace();
        }
        return con;

    }
}
