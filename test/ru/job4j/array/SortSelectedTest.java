package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort3Nums() {
        int[] input = new int[] {25, 41, 29};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {25, 29, 41};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort5Nums() {
        int[] input = new int[] {10, 6, 4, 8, 2};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {2, 4, 6, 8, 10};
        assertThat(result, is(expect));
    }
}