package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.MultiMax;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 4, 2);
        assertThat(result, is(4));
    }

    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(7, 4, 2);
        assertThat(result, is(7));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 4, 6);
        assertThat(result, is(6));
    }
}