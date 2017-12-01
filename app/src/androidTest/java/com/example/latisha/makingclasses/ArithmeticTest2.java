package com.example.latisha.makingclasses;

import junit.framework.TestCase;

/**
 * Created by wdumas on 2/24/2015.
 */
public class ArithmeticTest2 extends TestCase {

    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();

    }
    
    //Steps 27-28 implemented in lines 19-22 below
    public void testArithmeticAdd() {
        assertEquals(Arithmetic.add(2, 2), 4);
        assertEquals(Arithmetic.add(2, -5), -3);
    }
    //Step 29 implemented in lines 24-22 below
    public void testArithmeticSubtract() {
        assertEquals(Arithmetic.subtract(0,5), -5);
        assertEquals(Arithmetic.subtract(5,10), -5);
    }

    public void testArithmeticMultiply() {
        assertEquals(Arithmetic.multiply(10,5), 50);
        assertEquals(Arithmetic.multiply(2,25), 50);
    }

    public void testArithmeticDivide() {
        assertEquals(Arithmetic.divide(0,10), 0);
        assertEquals(Arithmetic.divide(0,20), 0);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}
