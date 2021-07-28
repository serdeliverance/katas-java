package io.github.serdeliverance.algorithms;

public class BubbleSort {

    public static int[] bubbleSort(int[] arr) {

        boolean sorted = false;

        while(!sorted) {
            boolean isAnySwap = false;
            for(int i=0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    int aux = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1]=aux;
                    isAnySwap = true;
                }
            }
            sorted = !isAnySwap;
        }

        return arr;
    }
}
