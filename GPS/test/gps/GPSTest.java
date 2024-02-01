/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package gps;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author david
 */
public class GPSTest {
    
    private GPS instance;
    
    public GPSTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        instance = new GPS(-5.0, 5.43, 200);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of main method, of class GPS.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        GPS.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAltitude method, of class GPS.
     */
    @Test
    public void testGetAltitude() {
        System.out.println("getAltitude");
        double expResult = 0.0;
        double result = instance.getAltitude();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAltitude method, of class GPS.
     */
    @Test
    public void testSetAltitude() {
        System.out.println("setAltitude");
        double altitude = 0.0;
        instance.setAltitude(altitude);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLatitude method, of class GPS.
     */
    @Test
    public void testSetLatitude() {
        System.out.println("setLatitude");
        double x = 0.0;
        GPS instance = new GPS(-5.0, 5.43, 200);
        instance.setLatitude(45.11);
        double result = instance.getLatitude();
        assertEquals(45.11, result, 0);
        
    }

    /**
     * Test of getLatitude method, of class GPS.
     */
    @Test
    public void testGetLatitude() {
        System.out.println("getLatitude");
        GPS instance = null;
        double expResult = 0.0;
        double result = instance.getLatitude();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLongitude method, of class GPS.
     */
    @Test
    public void testGetLongitude() {
        System.out.println("getLongitude");
        GPS instance = null;
        double expResult = 0.0;
        double result = instance.getLongitude();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLongitude method, of class GPS.
     */
    @Test
    public void testSetLongitude() {
        System.out.println("setLongitude");
        double longitude = 0.0;
        GPS instance = null;
        instance.setLongitude(longitude);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
