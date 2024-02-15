package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueFIFOTest {
    QueueFIFO<Integer> queue = new QueueFIFO<>();

    @Test
    void mustAddElement() {
        //given
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        //when
        queue.print();

        //then
        Assertions.assertEquals(1, queue.remove());
        Assertions.assertEquals(2, queue.remove());
        Assertions.assertEquals(3, queue.remove());
        Assertions.assertEquals(4, queue.remove());
    }

    @Test
    void mustRemoveElement() {
        //given
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.print();

        //when
        queue.remove();
        queue.remove();

        //then
        queue.print();
        Assertions.assertEquals(2, queue.size());
    }

    @Test
    void mustGetElement() {
        //given
        queue.add(3);
        queue.add(2);
        queue.add(1);

        //when
        queue.print();

        //then
        System.out.println("You can only take the first element from the queue");
        Assertions.assertEquals(3, queue.element());
        Assertions.assertEquals(3, queue.element());
        Assertions.assertEquals(3, queue.element());
        System.out.println("get element = " + queue.element());
    }

    @Test
    void mustIsFull() {
        //given
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        boolean expected = false;
        try {
            queue.add(6);
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
            expected = true;
        }

        //when
        try {
            queue.print();
        } catch (IndexOutOfBoundsException e) {
            e.getMessage();
        }

        //then
        Assertions.assertEquals(expected, queue.isFull());
    }

    @Test
    void mustIsEmpty() {
        //given
        queue.add(1);

        //when
        queue.remove();

        //then
        queue.print();
        Assertions.assertTrue(queue.isEmpty());
    }

    @Test
    void testSize() {
        //given
        queue.print();
        System.out.println("size = " + queue.size());

        //when
        queue.add(1);
        queue.add(2);
        queue.print();
        System.out.println("size = " + queue.size());

        //then
        queue.add(3);
        queue.add(4);
        queue.print();
        System.out.println("size = " + queue.size());
    }

}
