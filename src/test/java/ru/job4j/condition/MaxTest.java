package ru.job4j.condition;

import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax2To1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax4To4Then4() {
        int result = Max.max(4, 4);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1To2To3Then3() {
        assertThat(Max.max(1, 2, 3), is(3));
    }

    @Test
    public void whenMax3To5To9To2Then9() {
        assertThat(Max.max(3, 5, 9, 2), is(9));
    }
}