/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CESURMADRID
 */
public class Calculadora2Test {
    
    public Calculadora2Test() {
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
     * Test of suma method, of class Calculadora2.
     */
    @Test
    public void testSuma() {
        int resultado = Calculadora2.suma(2, 4);
        int esperado = 6;
        assertEquals(esperado, resultado);
    }

    /**
     * Test of resta method, of class Calculadora2.
     */
    @Test
    public void testResta() {
        int expResult = 3;
        int result = Calculadora2.resta(5, 2);
        assertEquals(expResult, result);

    }
    
}
