package io.github.serdeliverance.algorithms;

import java.util.List;

public class Recursion {
    public static int sum(List<Integer> list) {
        if (list.size() == 0) return 0;
        else {
            Integer element = list.remove(0);
            return element + sum(list);
        }
    }
}
