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

    @Test
    public void distance3d() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(1, 1, 1);
        assertEquals(1.732, a.distance3d(b), 0.01);
    }
}