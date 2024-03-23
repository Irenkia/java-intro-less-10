package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HashMapOwnTest {
    HashMapOwn<String, String> map = new HashMapOwn<>();

    @Test
    void mustPutElement() {
        //given
        map.put("key120", "Bob");
        map.put("key121", "Tom");
        map.put("key122", "Dev");
        map.put("key123", "Sam");

        //when
        map.print();

        //then
        Assertions.assertEquals("Bob", map.get("key120"));
        Assertions.assertEquals("Tom", map.get("key121"));
        Assertions.assertEquals("Dev", map.get("key122"));
        Assertions.assertEquals("Sam", map.get("key123"));

        System.out.println("getValue from \"key120\" = " + map.get("key120"));
        System.out.println("getValue from \"key121\" = " + map.get("key121"));
        System.out.println("getValue from \"key122\" = " + map.get("key122"));
        System.out.println("getValue from \"key123\" = " + map.get("key123"));
    }

    @Test
    void mustContainsKeyThenTrue_whenKeyWrongThenFalse() {
        //given
        map.put("key120", "Bob");
        map.put("key121", "Tom");
        map.put("key122", "Dev");
        map.put("key123", "Sam");

        //when
        map.print();

        //then
        Assertions.assertTrue(map.containsKey("key120"));
        Assertions.assertTrue(map.containsKey("key121"));
        Assertions.assertTrue(map.containsKey("key122"));
        Assertions.assertTrue(map.containsKey("key123"));
        Assertions.assertFalse(map.containsKey("key125"));

        System.out.println("containsKey \"key120\" " + map.containsKey("key120"));
        System.out.println("containsKey \"key121\" " + map.containsKey("key121"));
        System.out.println("containsKey \"key122\" " + map.containsKey("key122"));
        System.out.println("containsKey \"key123\" " + map.containsKey("key123"));
        System.out.println("containsKey \"key125\" " + map.containsKey("key125"));
    }

    @Test
    void mustContainsValueThenTrue_whenValueWrongThenFalse() {
        //given
        map.put("key120", "Bob");
        map.put("key121", "Tom");
        map.put("key122", "Dev");
        map.put("key123", "Sam");

        //when
        map.print();

        //then
        Assertions.assertTrue(map.containsValue("Bob"));
        Assertions.assertTrue(map.containsValue("Tom"));
        Assertions.assertTrue(map.containsValue("Dev"));
        Assertions.assertTrue(map.containsValue("Sam"));
        Assertions.assertFalse(map.containsValue("Mary"));

        System.out.println("containsValue \"Bob\" " + map.containsValue("Bob"));
        System.out.println("containsValue \"Tom\" " + map.containsValue("Tom"));
        System.out.println("containsValue \"Dev\" " + map.containsValue("Dev"));
        System.out.println("containsValue \"Sam\" " + map.containsValue("Sam"));
        System.out.println("containsValue \"Mary\" " + map.containsValue("Mary"));
    }

    @Test
    void mustRemoveElementWhenKeyAreInMapShouldReturnValue_whenKeyWrongReturnNull() {
        //given
        map.put("key120", "Bob");
        map.put("key121", "Tom");
        map.put("key122", "Dev");
        map.put("key123", "Sam");

        //when
        map.print();

        //then
        Assertions.assertEquals("Tom", map.get("key121"));
        Assertions.assertEquals("Sam", map.get("key123"));
        Assertions.assertNull(null, map.get("key121"));

        System.out.println("remove \"key121\" and getValue = " + map.remove("key121"));
        System.out.println("remove \"key123\" and getValue = " + map.remove("key123"));
        System.out.println("remove \"key121\" and getValue = " + map.remove("key121"));
    }

    @Test
    void mustGetElementReturnValueForGivenKey() {
        //given
        map.put("key120", "Bob");
        map.put("key121", "Tom");
        map.put("key122", "Dev");
        map.put("key123", "Sam");

        //when
        map.print();

        //then
        Assertions.assertEquals("Bob", map.get("key120"));
        Assertions.assertEquals("Tom", map.get("key121"));
        Assertions.assertEquals("Dev", map.get("key122"));
        Assertions.assertEquals("Sam", map.get("key123"));

        System.out.println("getValue from \"key120\" = " + map.get("key120"));
        System.out.println("getValue from \"key121\" = " + map.get("key121"));
        System.out.println("getValue from \"key122\" = " + map.get("key122"));
        System.out.println("getValue from \"key123\" = " + map.get("key123"));
    }

    @Test
    void mustGiveExceptionWhenKeyWrong() {
        //given
        map.put("key120", "Bob");
        map.put("key121", "Tom");
        map.put("key122", "Dev");
        map.put("key123", "Sam");
        boolean expected = true;


        //when
        map.print();
        try {
            System.out.println("getValue from \"key125\" = " + map.get("key125"));
        } catch (NullPointerException e) {
            e.getMessage();
            expected = false;
        }

        //then
        Assertions.assertTrue(expected);
    }

}
