package com.flipkart.gradle.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Created by imteyaz.khan on 22/09/17.
 */
@RunWith(JUnit4.class)
public class MathUtilTest {
    @Test
    public void testSum() {
       Assert.assertEquals(6, MathUtil.add(4, 2));
    }

    @Test
    public void testNotNull() {
        Assert.assertNotNull("ABCD");
    }

}
