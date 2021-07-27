package io.github.serdeliverance.easy;

import java.util.List;

public class Hourglass {

    public static int hourglassSum(List<List<Integer>> arr) {

        int limit = arr.size() - 3;

        int max = Integer.MIN_VALUE;

        int aux = 0;

        for(int i = 0; i <= limit; i++) {
            for(int j = 0; j <= limit; j++) {
                aux = hourglassSumAtPosition(i, j, arr);
                if (aux > max) {
                    max = aux;
                }
            }
        }

        return max;
    }

    private static int hourglassSumAtPosition(int i, int j, List<List<Integer>> arr) {
        return arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2) + arr.get(i + 1).get(j + 1) + arr.get(i+2).get(j) + arr.get(i+2).get(j + 1) + arr.get(i+2).get(j + 2);
    }


}
