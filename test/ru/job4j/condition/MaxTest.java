package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import org.junit.Assert;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void max() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void equal() {
        int result = Max.equal(1, 1);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxright() {
        int result = Max.equal(1, 2);
        int expected = 2;
        Assert.assertEquals(expected, result);
    }
}