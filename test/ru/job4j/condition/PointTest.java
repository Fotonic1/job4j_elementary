package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void distance() {
        Point point = new Point(0, 0);
        Point point1 = new Point(0, 1);
        double expected = 1;
        double out = point.distance(point1);
        Assert.assertEquals(expected, out, 0.01);
    }
}