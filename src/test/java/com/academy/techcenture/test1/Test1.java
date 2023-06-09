package com.academy.techcenture.test1;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    @BeforeMethod
    public void setUp(){
        System.out.println("Running before test");
    }

    @AfterMethod
    public void tearDown(){
        System.out.println("Running after test");
    }

    @Test
    public void test1(){
        System.out.println("Running Test 1");
        Assert.assertTrue(1==1);
    }

    @Test
    public void test2(){
        System.out.println("Running Test 2");
        Assert.assertEquals("Hello", "Hello");
    }

    @Test
    public void test3(){
        System.out.println("Running Test 3");
        Assert.assertEquals("Muharrem", "Muharrem");
    }

    @Test
    public void test4(){
        System.out.println("Running Test 4");
        Assert.assertEquals("Hello", "Hello");
    }

    @Test
    public void test5(){
        System.out.println("Running Test 5");
        Assert.assertEquals("Muharrem", "Muharrem");
    }

}
