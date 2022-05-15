package com.myfirstproject;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Day03_FirstJunitClass {

    /*
    @Test -> Marks a method as a Test case
    All test methods are void
    We create test cases for assertion, not to return a value
    We no longer need main method for Creating or Running test cases
    We can run test methods from the method level or class level
    Testers can use Junit for creating automation framework
    Devs can use Junit for creating Unit test framework
     */
    @Before
    public void setUp(){
        System.out.println("BEFORE METHOD");
    }
    @After
    public void tearDown (){
        System.out.println("AFTER METHOD");
    }

    @Test
    public void test01(){
        System.out.println("This is Test 1");
    }
    @Test
    public void test2(){
        System.out.println("This is Test 2");
    }
    @Test
    public void test3(){
        System.out.println("This is Test 3");
    }
    @Test
    public void test4(){
        System.out.println("This is Test 4");
    }
}
