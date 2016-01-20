/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.telnumberident.ruslan;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ruslan
 */
public class PhoneProviderTest {
    
    public PhoneProviderTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of value method, of class PhoneProvider.
     */
    @Test
    public void testValue() {
        System.out.println("value");
        String expResult = "";
        PhoneProvider instance = new PhoneProvider(expResult);
        String result = instance.value();
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PhoneProvider.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        String expResult = "TEST";
        PhoneProvider instance = new PhoneProvider(expResult);
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class PhoneProvider.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        String strProvider = "TEST";
        PhoneProvider object2 = new PhoneProvider(strProvider);
        PhoneProvider instance = new PhoneProvider(strProvider);
        boolean expResult = true;
        boolean result = instance.equals(object2);
        assertEquals(expResult, result);
    }
    
        /**
     * Test of equals method, of class PhoneProvider.
     */
    @Test
    public void testEqualsWithWrongObject() {
        System.out.println("equals");
        String strProvider = "TEST";
        String object2 = strProvider;
        PhoneProvider instance = new PhoneProvider(strProvider);
        boolean expResult = false;
        boolean result = instance.equals(object2);
        assertEquals(expResult, result);
    }
    
}
