
package com.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
 
/**
 *
 * @author joshuasackey
 */
public class CalculatorTest {

     public CalculatorTest() {
    }

    /**
     * Test of add method, of class Calculator.
     */
    @Test
    public void testAdd() {
        Integer a1 = 1;
        Integer b2 = 2;
        Calculator instance = new Calculator();
        Integer expResult = 3;
        Integer result = instance.add(a1, b2);
        assertEquals(expResult, result);
    }

    /**
     * Test of multiply method, of class Calculator.
     */
    @Test
    public void testMultiply() {
        Integer a1 = 5;
        Integer b2 = 3;
        Calculator instance = new Calculator();
        Integer expResult = 15;
        Integer result = instance.multiply(a1, b2);
        assertEquals(expResult, result);
    }

}