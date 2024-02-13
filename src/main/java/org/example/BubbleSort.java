package org.example;

import java.util.*;

public class BubbleSort<T extends Comparable<? super T>> {
    public static void main(String[] args) {
        Integer[] arrInt = {7, 3, 1, 9, 2, 5};
        BubbleSort<Integer> arrayOfIntegers = new BubbleSort<>(arrInt);
        arrayOfIntegers.bubbleSort(arrInt);
        System.out.println(Arrays.toString(arrInt));

        String[] arrStr = {"Jim", "Tom", "Albert", "Roger", "Lloyd", "Samuel", "Max", "Oscar"};
        BubbleSort<String> arrayOfStrings = new BubbleSort<>();
        arrayOfStrings.bubbleSort(arrStr);
        System.out.println(Arrays.toString(arrStr));

        Double[] arrDouble = {0.82, 0.02, 0.36, 0.41, 0.17, 0.66, 0.96, 0.25, 0.52};
        BubbleSort<Double> arrayOfDoubles = new BubbleSort<>();
        arrayOfDoubles.bubbleSort(arrDouble);
        System.out.println(Arrays.toString(arrDouble));
    }

    private T[] arr;

    public BubbleSort() {
    }

    public BubbleSort(T[] arr) {
        this.arr = arr;
    }

    public void bubbleSort(T[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    toSwap(arr, j);
                }
            }
        }
    }

    private void toSwap(T[] arr, int index) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }
}
