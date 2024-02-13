package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PairTest {
    Pair pair = new Pair();

    @Test
    public void mustAcceptIntegerInClassPair() {
        //given
        pair = new Pair(1, 255);

        //when
        Integer key = (Integer) pair.getKey();
        Integer value = (Integer) pair.getValue();


        //then
        Assertions.assertEquals(1, key);
        Assertions.assertEquals(255, value);
    }

    @Test
    public void mustAcceptDoubleInClassPair() {
        //given
        pair = new Pair(3.0, 255.5);

        //when
        double key = (double) pair.getKey();
        double value = (double) pair.getValue();


        //then
        Assertions.assertEquals(3.0, key);
        Assertions.assertEquals(255.5, value);
    }

    @Test
    public void mustAcceptIntegerAndStringInClassPair() {
        //given
        pair = new Pair(2, "Tom");

        //when
        Integer key = (Integer) pair.getKey();
        String value = (String) pair.getValue();


        //then
        Assertions.assertEquals(2, key);
        Assertions.assertEquals("Tom", value);
    }

    @Test
    public void mustAcceptDoubleAndStringInClassPair() {
        //given
        pair = new Pair(2.0, "David");

        //when
        double key = (double) pair.getKey();
        String value = (String) pair.getValue();


        //then
        Assertions.assertEquals(2.0, key);
        Assertions.assertEquals("David", value);
    }

    @Test
    public void mustAcceptStringInClassPair() {
        //given
        pair = new Pair("22", "Bob");

        //when
        String key = (String) pair.getKey();
        String value = (String) pair.getValue();


        //then
        Assertions.assertEquals("22", key);
        Assertions.assertEquals("Bob", value);
    }

}
