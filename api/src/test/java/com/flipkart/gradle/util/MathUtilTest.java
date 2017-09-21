package com.flipkart.gradle.util;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by imteyaz.khan on 22/09/17.
 */
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
