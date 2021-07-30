package io.github.serdeliverance.medium;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class SparseArrays {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

        Map<String, List<String>> ocurrenceMap = strings.stream().collect(groupingBy(String::valueOf));

        return queries.stream().map(q -> ocurrenceMap.getOrDefault(q, List.of()).size()).collect(Collectors.toList());
    }
}
