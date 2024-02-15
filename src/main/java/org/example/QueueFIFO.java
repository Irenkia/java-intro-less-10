package org.example;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class QueueFIFO<I extends Integer> implements OwnQueue {

    private Object[] queueFifo;
    private int head;
    private int tail;
    private int size = 5;
    private int pointer = 0;

    public QueueFIFO() {
        queueFifo = new Object[size];
        head = -1;
        tail = -1;
    }

    public QueueFIFO(int size) {
        this.queueFifo = new Object[size];
        this.head = -1;
        this.tail = -1;
        this.size = size;
    }

    @Override
    public boolean add(Integer e) {
        if (isFull()) {
            System.out.println("The queue is full");
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty()) {
            head = 0;
            tail = 0;
            queueFifo[head] = e;
        } else {
            tail++;
            queueFifo[tail] = e;
        }
        pointer++;
        System.out.println("Added element : " + e);
        return true;
    }

    @Override
    public Integer remove() {
        Integer el;
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return -1;
        } else {
            el = (Integer) queueFifo[head];
            if (head == tail) {
                head = -1;
                tail = -1;
            } else {
                head++;
            }
            System.out.println("Removed element : " + el);
            pointer--;
            return el;
        }
    }

    @Override
    public Integer element() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return (Integer) queueFifo[head];
    }

    boolean isFull() {
        if (head == 0 && tail == size - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (head == -1) {
            return true;
        } else {
            return false;
        }
    }

    public int size() {
        return pointer;
    }

    void print() {
        if (isFull()) {
            System.out.println("Full queue");
            throw new IndexOutOfBoundsException();
        }
        if (isEmpty()) {
            System.out.println("Empty queue");
        } else {
            System.out.println("\nIndex HEAD : " + head);
            System.out.print("Elements : ");
            for (int i = head; i <= tail; i++) {
                System.out.print(queueFifo[i] + "  ");
            }
            System.out.println("\nIndex TAIL : " + tail);
        }
    }
}
