package com.experitest;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by yotam.gamliel on 10/19/2017.
 */
public class SimpleTest2 {

    static final boolean bool = true;

    @Test
    public void myFirstTest() {
        System.out.println("Running tests 1...");
        Assert.assertTrue(bool, "Simple Test Failed ");

    }

    @Test
    public void myFirstTest2() {
        System.out.println("Running tests 2...");
        Assert.assertTrue(bool, "Simple Test Failed ");

    }

    @Test
    public void myFirstTest3() {
        System.out.println("Running tests 3...");
        Assert.assertTrue(bool, "Simple Test Failed ");

    }

    @Test
    public void myFirstTest4() {
        System.out.println("Running tests 4 ...");
        Assert.assertTrue(bool, "Simple Test Failed ");

    }

}
