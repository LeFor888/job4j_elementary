package ru.job4j.condition;

import  org.junit.Assert;
import org.junit.Test;


public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(2, 1);
        Assert.assertEquals(2, result);
    }

    @Test
    public void max2() {
        int result = Max.max(2, 1, 3);
        Assert.assertEquals(3, result);
    }

    @Test
    public void max3() {
        int result = Max.max(2, 1, 3, 5);
        Assert.assertEquals(5, result);
    }

    @Test
    public void equal() {
        int result = Max.equal(1, 1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void equal2() {
        int result = Max.equal(2, 2, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void maxright() {
        int result = Max.maxRight(1, 2);
        Assert.assertEquals(2, result);
    }

    @Test
    public void maxright2() {
        int result = Max.maxRight(1, 3, 2);
        Assert.assertEquals(3, result);
    }
}