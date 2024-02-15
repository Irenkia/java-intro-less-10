package org.example;

import java.util.Arrays;

public class GenericList<E> implements OwnList<E> {

    private static final int DEFAULT_CAPACITY = 10;
    private int newCapacity = DEFAULT_CAPACITY * 2;

    private E[] genericList;

    private int pointer = 0;

    public GenericList() {
        genericList = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public GenericList(int initSize) {
        if (initSize < 0) {
            throw new IllegalArgumentException("illegal size:" + initSize);
        }
        this.genericList = (E[]) new Object[initSize];
    }

    public GenericList(E[] genericList) {

        this.genericList = genericList;
    }

    @Override
    public boolean add(E e) {
        if (pointer == genericList.length - 1) {
            resize(newCapacity);
        }
        genericList[pointer++] = e;
        return true;
    }

    @Override
    public E get(int index) {
        if (index >= pointer || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        return genericList[index];
    }

    @Override
    public boolean remove(E o) {
        for (int i = 0; i < pointer; i++) {
            if (this.genericList[i].equals(o)) {
                removeByIndex(i);
                return true;
            }
        }
        return false;
    }

    private boolean removeByIndex(int index) {
        if (index >= pointer || index < 0) {
            return false;
        }
        for (int i = index; i < pointer; i++) {
            genericList[i] = genericList[i + 1];
        }
        pointer--;
        return true;
    }

    @Override
    public int size() {
        return pointer;
    }

    public void resize(int newCapacity) {
        genericList = Arrays.copyOf(genericList, newCapacity);
    }

    private static void printGenericList(Object[] genericList) {
        for (Object el : genericList) {
            System.out.print(el + " ");
        }
    }
}
