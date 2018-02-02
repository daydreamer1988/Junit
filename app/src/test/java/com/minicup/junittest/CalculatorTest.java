package com.minicup.junittest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by gy on 2018/1/31.
 */
public class CalculatorTest {
    private Calculator calculator;

    public CalculatorTest() {
        System.out.println("CalculatorTest()");
    }


    @Test
    public void add() throws Exception {
        System.out.println("add");
        int actualResult = calculator.add(3, 4);
        int expectedResult = 7;
        assertEquals("add", expectedResult, actualResult);
    }

    @Test
    public void minus() throws Exception {
        System.out.println("minus");
        int actualResult = calculator.minus(7, 3);
        int expectedResult = 4;
        assertEquals("minus", expectedResult, actualResult);
    }


    @BeforeClass
    public static void setUpClass() {
        System.out.println("@BeforeClass");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("@AfterClass");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("@Before");
        calculator = new Calculator();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("@After");
        calculator = null;
    }
}

/**
 *生命周期
 @BeforeClass
 CalculatorTest()
 @Before
 @add
 @After
 CalculatorTest()
 @Before
 @minus
 @After
 @AfterClass
 */