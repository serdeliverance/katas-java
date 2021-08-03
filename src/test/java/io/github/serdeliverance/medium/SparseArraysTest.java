package io.github.serdeliverance.medium;

import org.junit.jupiter.api.Test;

import java.util.List;

import static io.github.serdeliverance.medium.SparseArrays.matchingStrings;
import static org.junit.jupiter.api.Assertions.*;

class SparseArraysTest {

    @Test
    void test() {
        List<String> strings = List.of("aba", "baba", "aba", "xzxb");
        List<String> queries = List.of("aba", "xzxb", "ab");

        List<Integer> result = matchingStrings(strings, queries);

        assertEquals(List.of(2, 1, 0), result);
    }

    @Test
    void test2() {
        List<String> strings = List.of("def", "de", "fgh");
        List<String> queries = List.of("de", "lmn", "fgh");

        List<Integer> result = matchingStrings(strings, queries);

        assertEquals(List.of(1, 0, 1), result);
    }
}