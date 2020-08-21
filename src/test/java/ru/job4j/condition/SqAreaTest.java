package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.SqArea;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenK2P6Square() {
        int k = 2;
        int p = 6;
        double expected = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenK1P6Square() {
        int k = 1;
        int p = 6;
        double expected = 1;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }
}