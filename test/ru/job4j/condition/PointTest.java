package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double out = a.distance(b);
        Assert.assertEquals(2, out, 0.01);
    }

    @Test
    public void when22to65then5() {
        Point a = new Point(2, 2);
        Point b = new Point(6, 5);
        double out = a.distance(b);
        Assert.assertEquals(5, out, 0.01);
    }

}