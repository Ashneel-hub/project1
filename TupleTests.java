/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.Assert.assertEquals;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ashneel
 */
public class TupleTests {
    
    public TupleTests() {
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

    @Test
    public void TupleTest1() {
        System.out.println("getX");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getY method, of class Tuple.
     */
    @Test
    public void TupleTest2() {
        System.out.println("getY");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);

    }

    /**
     * Test of getXf method, of class Tuple.
     */
    @Test
    public void TupleTest3() {
        System.out.println("getXf");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getXf();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of getYf method, of class Tuple.
     */
    @Test
    public void TupleTest4() {
        System.out.println("getYf");
        Tuple instance = null;
        int expResult = 0;
        int result = instance.getYf();
        assertEquals(expResult, result);

    }
    
}
