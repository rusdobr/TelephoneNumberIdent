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
import java.util.Arrays;

/**
 *
 * @author ruslan
 */
public class TelephoneNumberIdentUATest {
    
    public TelephoneNumberIdentUATest() {
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
     * Test of readResolve method, of class TelephoneNumberIdentUA.
     */
    @Test
    public void testReadResolve() {
        System.out.println("readResolve");
        TelephoneNumberIdentUA instance = TelephoneNumberIdentUA.createInstance();
        Object expResult = instance;
        Object result = instance.readResolve();
        assertEquals(expResult, result);
    }

    /**
     * Test of createInstance method, of class TelephoneNumberIdentUA.
     */
    @Test
    public void testCreateInstance() {
        System.out.println("createInstance");
        TelephoneNumberIdentUA expResult = null;
        TelephoneNumberIdentUA result = TelephoneNumberIdentUA.createInstance();
        assertTrue(result instanceof TelephoneNumberIdentUA);
    }

    /**
     * Test of ident method, of class TelephoneNumberIdentUA.
     */
    @Test
    public void testIdent() {
        System.out.println("ident");
        PhoneNumber number = new PhoneNumber();
        TelephoneNumberIdentUA instance = TelephoneNumberIdentUA.createInstance();
        PhoneProvider[] expResult = { 
            new PhoneProvider("MTS"),
            new PhoneProvider("K*")
        };
        PhoneProvider[] result = instance.ident(number);
        System.out.println(Arrays.toString(result));
        //assertArrayEquals(expResult, result);
    }

    /**
     * Test of search method, of class TelephoneNumberIdentUA.
     */
    @Test
    public void testSearch() {
        System.out.println("search");
        PhoneNumber number = new PhoneNumber();
        TelephoneNumberIdentUA instance = TelephoneNumberIdentUA.createInstance();
        PhoneMaskItem[] expResult = { 
           
        };
        PhoneMaskItem[] result = instance.search(number);
        System.out.println(Arrays.toString(result));
        //assertArrayEquals(expResult, result);
    }
    
}
