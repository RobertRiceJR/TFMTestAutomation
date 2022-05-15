package com.myfirstproject;

import org.junit.Assert;
import org.junit.Test;

public class day03Assertions {

    @Test
    public void assertions(){

        Assert.assertEquals(5,5);
        Assert.assertTrue("SELENIUM".contains("E"));
        Assert.assertFalse("JAVA".contains("E"));
        Assert.assertFalse("SELENIUM".contains("E"));
            }
}
