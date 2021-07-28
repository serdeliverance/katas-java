package io.github.serdeliverance.algorithms;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {

    @Test
    void sort() {
        int[] input = new int[]{ 141, 94, 61, 111, 35};

        BubbleSort.bubbleSort(input);

        assertArrayEquals(new int[]{35,61,94, 111, 141} , input);
    }
}