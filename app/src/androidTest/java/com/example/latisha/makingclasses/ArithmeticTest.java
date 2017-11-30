package com.example.latisha.makingclasses;

import junit.framework.TestCase;

/**
 * Created by Latisha on 11/29/17.
 */

public class ArithmeticTest extends TestCase {
    // Step 12 implemented in lines 11-26 below
    Arithmetic a;

    @Override
    public void setUp()throws Exception{
        super.setUp();
        a = new Arithmetic();
    }

    public void testArithmeticAdd() {
        assertEquals(a.add(), 12);
    }

    // Step 14 implemented in lines 24-33 below
    public void testArithmeticSubtract() {
        assertEquals(a.subtract(), 8);
    }
    public void testArithmeticMultiply() {
        assertEquals(a.multiply(), 20);
    }
    public void testArithmeticDivide() {
        assertEquals(a.divide(), 5);
    }

    @Override
    public void tearDown() throws Exception{
        super.tearDown();
    }

}
