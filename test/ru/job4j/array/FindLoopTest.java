package ru.job4j.array;

import static org.junit.Assert.*;
import org.junit.Test;
import static org.hamcrest.core.Is.is;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int value = 5;
        int[] input = new int[] {5, 4, 3};
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayNotHas1() {
        int value = 1;
        int[] input = new int[] {5, 4, 9, 8, 7};
        int rst = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(rst, is(expect));
    }
}