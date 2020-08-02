package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] input = {5, 4, 3, 2};
        int value = 5;
        int result = FindLoop.indexOf(input, value);
        int expect = 0;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas6() {
        int[] input = {2, 8, 9, 13};
        int value = 6;
        int result = FindLoop.indexOf(input, value);
        int expect = -1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas19Than3() {
        int[] input = {14, 89, 13, 19};
        int value = 19;
        int result = FindLoop.indexOf(input, value);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenArrayHas151Than1() {
        int[] input = {195, 151, 103, 109};
        int value = 151;
        int result = FindLoop.indexOf(input, value);
        int expect = 1;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind3() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 3;
        assertThat(result, is(expect));
    }

    @Test
    public void whenFind5() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 10;
        int start = 1;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = 2;
        assertThat(result, is(expect));
    }

    @Test
    public void whenNotFind4() {
        int[] input = new int[] {5, 2, 10, 2, 4};
        int value = 4;
        int start = 0;
        int finish = 3;
        int result = FindLoop.indexOf(input, value, start, finish);
        int expect = -1;
        assertThat(result, is(expect));
    }
}