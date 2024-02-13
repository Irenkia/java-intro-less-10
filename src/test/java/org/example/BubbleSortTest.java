package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {
    @Test
    public void mustAcceptIntegerInClassBubbleSort() {
        //given
        Integer[] arrInt = {7, 3, 1, 9, 2, 5};
        BubbleSort<Integer> arrayOfIntegers = new BubbleSort<>(arrInt);

        //when
        Arrays.sort(arrInt);
        Integer[] expected_result = arrayOfIntegers.bubbleSort(arrInt);


        //then
        Assertions.assertArrayEquals(arrInt, expected_result);
        System.out.println(Arrays.toString(arrInt));
    }

    @Test
    public void mustAcceptStringInClassBubbleSort() {
        //given
        String[] arrStr = {"Jim", "Tom", "Albert", "Roger", "Lloyd", "Samuel", "Max", "Oscar"};
        BubbleSort<String> arrayOfIntegers = new BubbleSort<>(arrStr);

        //when
        Arrays.sort(arrStr);
        String[] expected_result = arrayOfIntegers.bubbleSort(arrStr);


        //then
        Assertions.assertArrayEquals(arrStr, expected_result);
        System.out.println(Arrays.toString(arrStr));
    }

    @Test
    public void mustAcceptDoubleInClassBubbleSort() {
        //given
        Double[] arrDouble = {0.82, 0.02, 0.36, 0.41, 0.17, 0.66, 0.96, 0.25, 0.52};
        BubbleSort<Double> arrayOfIntegers = new BubbleSort<>(arrDouble);

        //when
        Arrays.sort(arrDouble);
        Double[] expected_result = arrayOfIntegers.bubbleSort(arrDouble);


        //then
        Assertions.assertArrayEquals(arrDouble, expected_result);
        System.out.println(Arrays.toString(arrDouble));
    }

}
