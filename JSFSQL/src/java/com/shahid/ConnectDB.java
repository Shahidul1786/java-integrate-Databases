/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shahid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Shahidul
 */
public class ConnectDB {

    Connection con;

    String url = "jdbc:mysql://localhost:3306/product_db1";
    String user = "root";
    String password = "st@#1786";

    public Connection doConnect() {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            con = (Connection) DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
           e.printStackTrace();

        }

        return con;
    }

}
