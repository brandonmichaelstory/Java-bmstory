/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.tolowerkattisproblem;


import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author micha
 */
public class AppTest {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /**
     * Test of main method, of class App.
     */

    /**
     * Test of fixable method, of class App.
     */
    @Test
    public void testFixable() {
        String text = "Hello";
        App instance = new App();
        boolean expResult = true;
        assertEquals(expResult, instance.fixable(text));
        text = "HELlo";
        expResult = false;
        assertEquals(expResult, instance.fixable(text));
        text = "hEllo";
        assertEquals(expResult, instance.fixable(text));
    }
    
    
    
}
