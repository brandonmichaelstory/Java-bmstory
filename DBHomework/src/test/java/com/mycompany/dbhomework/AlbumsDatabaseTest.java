/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.dbhomework;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class AlbumsDatabaseTest {
    
    public AlbumsDatabaseTest() {
    }
    

    /**
     * Test of createNewDatabase method, of class AlbumsDatabase.
     */
    @Test
    public void testCreateNewDatabase() {
        System.out.println("createNewDatabase");
        AlbumsDatabase instance = new AlbumsDatabase();
        instance.createNewDatabase();
        try (Connection connection = DriverManager.getConnection(instance.DEFAULT_URL)) {
            ResultSet resultSet = connection.getMetaData().getCatalogs();
            resultSet.next();
            String dbName = resultSet.getString(1);
            System.out.println(dbName);
            assertEquals("test.db", dbName);
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Test of createNewTable method, of class AlbumsDatabase.
     */
    @Test
    public void testCreateNewTable() {
        System.out.println("createNewTable");
        String tableName = "StevieWonderAlbums";
        AlbumsDatabase instance = new AlbumsDatabase();
        instance.createNewTable(tableName);
        try (Connection connection = DriverManager.getConnection(instance.DEFAULT_URL)){
            DatabaseMetaData dbm = connection.getMetaData();
           ResultSet resultSet = dbm.getTables(null, null, tableName, null);
           //resultSet.next();
           String tableNameResult = resultSet.getString(0);
           assertEquals(tableName, tableNameResult);
        
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

    /**
     * Test of deleteTable method, of class AlbumsDatabase.
     */
    @Test
    public void testDeleteTable() {
        System.out.println("deleteTable");
        String tableName = "StevieWonderAlbums";
        AlbumsDatabase instance = new AlbumsDatabase();
        instance.deleteTable(tableName);
        try (Connection connection = DriverManager.getConnection(instance.DEFAULT_URL)){
            DatabaseMetaData dbm = connection.getMetaData();
           ResultSet resultSet = dbm.getTables(null, null, tableName, null);
           //resultSet.next();
           String tableNameResult = resultSet.getString(0);
           assertEquals(null, tableNameResult);
        
        }
        catch (SQLException e) {
            System.out.println(e.toString());
        }
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of insert method, of class AlbumsDatabase.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        String tableName = "";
        String AlbumName = "";
        int year = 0;
        AlbumsDatabase instance = new AlbumsDatabase();
        instance.insert(tableName, AlbumName, year);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
