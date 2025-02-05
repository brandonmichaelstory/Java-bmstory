/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbhomework;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author micha
 */
public class AlbumsDatabase {
    
    public static String DEFAULT_DB = "albums.db";
    public static String DEFAULT_URL = "jdbc:sqlite:" + DEFAULT_DB;

    public static void main(String[] args) {
        
        AlbumsDatabase ad = new AlbumsDatabase();
        ad.createNewDatabase();
        String tableName = "HueyLewisAlbums";
        ad.createNewTable(tableName);
        ad.insert(tableName, "Sports", 1983);
    }
    
    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(this.DEFAULT_URL);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
     public void createNewDatabase() {

        try (Connection conn = connect()) {
            if (conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
                System.out.println("The driver name is " + meta.getDriverName());
                System.out.println("A new database has been created.");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
     public void createNewTable(String tableName) {
       String sql = "CREATE TABLE IF NOT EXISTS " + tableName + " (\n"
                + "	AlbumName text PRIMARY KEY NOT NULL,\n"
                + "	Year integer NOT NULL\n"
                + ");";
        try (Connection conn = connect();
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
     
      public void deleteTable(String tableName) {
        String sql = "DROP TABLE IF EXISTS ";
        sql += tableName +";";
        try (Connection conn = connect();
                        Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public void insert(String tableName, String AlbumName, int year) {
        String sql = "INSERT INTO " + tableName + " (AlbumName, Year) VALUES (?,?)";

        try (Connection conn = this.connect();
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, AlbumName);
            pstmt.setInt(2, year);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
