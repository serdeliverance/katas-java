package io.github.serdeliverance.algorithms;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static io.github.serdeliverance.algorithms.Recursion.sum;
import static org.junit.jupiter.api.Assertions.*;

class RecursionTest {

    @Test
    void sumMustBeCorrect() {
        List<Integer> list = new ArrayList<>() ;
        list.add(1);
        list.add(2);
        list.add(3);

        Integer result = sum(list);

        assertEquals(6, result);
    }

    @Test
    void sumOfOneElementListMustBeTheElement() {
        List<Integer> list = new ArrayList<>() ;
        list.add(3);

        Integer result = sum(list);

        assertEquals(3, result);
    }

    @Test
    void sumOfEmptyListMustBeZero() {
        List<Integer> list = List.of();

        Integer result = sum(list);

        assertEquals(0, result);
    }
}