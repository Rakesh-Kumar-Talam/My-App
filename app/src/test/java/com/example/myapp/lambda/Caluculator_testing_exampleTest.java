package com.example.myapp.lambda;

import junit.framework.TestCase;

public class Caluculator_testing_exampleTest extends TestCase {

    //creating object
    Caluculator_testing_example Calculator;

    //oncreate
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        Calculator = new Caluculator_testing_example();
    }

    public void testAdd() {
        int expected = 30;
        int actual = Calculator.add(10,20);
        assertEquals(expected,actual);
    }

    //on destroy

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testMultiply() {
        int expected = 20;
        int actual = Calculator.multiply(5,4);
        assertEquals(expected,actual);
    }
}