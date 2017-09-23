package com.flipkart.gradle.test;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by imteyaz.khan on 23/09/17.
 */

public class SampleIntegrationTest {
    @Test
    public void integrationTest1() {
        Assert.assertTrue(true);
    }

    @Test
    public void integrationTest2() {
        Assert.assertNotNull(Integer.valueOf(1));
    }
}
