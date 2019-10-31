/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbhomework;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author micha
 */
public class AlbumsDatabase {
    
    public static String DEFAULT_DB = "testAlbums.db";
    public static String DEFAULT_URL = "jdbc:sqlite:" + DEFAULT_DB;

    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.DEFAULT_URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
}
