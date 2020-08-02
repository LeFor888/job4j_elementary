package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MinTest {
    @Test
    public void whenFirstMin() {
        assertThat(Min.findMin(new int[] {0, 5, 10}), is(0));
    }

    @Test
    public void whenLastMin() {
        assertThat(Min.findMin(new int[] {10, 5, 3}), is(3));
    }

    @Test
    public void whenMiddleMin() {
        assertThat(Min.findMin(new int[] {10, 2, 5}), is(2));
    }

    @Test
    public void whenForthMin() {
        assertThat(Min.findMin(new int[] {18, 22, 5, 1}), is(1));
    }

    @Test
    public void whenThirdMin() {
        assertThat(Min.findMin(new int[] {18, 22, 5, 11, 9, 14, 31}), is(5));
    }
}