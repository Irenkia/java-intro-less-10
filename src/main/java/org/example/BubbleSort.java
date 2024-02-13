package org.example;

import java.util.*;

public class BubbleSort<T extends Comparable<? super T>> {

    private T[] arr;

    public BubbleSort() {
    }

    public BubbleSort(T[] arr) {
        this.arr = arr;
    }

    public T[] bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    toSwap(arr, j);
                }
            }
        }
        return arr;
    }

    private void toSwap(T[] arr, int index) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }
}
