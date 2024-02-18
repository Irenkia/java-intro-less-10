package org.example;

import java.util.Arrays;

public class HashMapOwn<K, V extends String> implements OwnMap {

    private int length = 16;
    private int newLength = length * 2;
    private KeyValue<K, V>[] hashArr;
    private int pointer = 0;

    public HashMapOwn() {
        hashArr = new KeyValue[length];
    }

    @Override
    public boolean put(String key, String value) {
        if (key == null) {
            throw new RuntimeException("Illegal key: " + key);
        }
        if (pointer == hashArr.length - 1) {
            resize(newLength);
        }
        int index = hashing(key);
        KeyValue<K, V> newPair = new KeyValue<>(key, value);
        KeyValue<K, V> pair = hashArr[index];
        if (pair == null) {
            hashArr[index] = newPair;
        } else {
            while (pair != null) {
                if (pair.getKey().equals(key)) {
                    pair.setValue(value);
                    break;
                }
            }
            if (pair.next != null) {
                pair = pair.next;
            } else {
                pair.next = newPair;
            }
        }
        pointer++;
        return true;
    }

    @Override
    public boolean containsKey(String key) {
        int index = hashing(key);
        KeyValue<K, V> pair = hashArr[index];
        while (pair != null) {
            if (pair.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        for (int i = hashArr.length; i-- > 0; ) {
            for (KeyValue<K, V> pair = hashArr[i]; pair != null; pair = pair.next) {
                if (pair.getValue().equals(value)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String remove(String key) {
        if (pointer != 0) {
            int index = hashing(key);
            KeyValue<K, V> pair = hashArr[index];
            KeyValue<K, V> previous = null;
            while (pair != null) {
                if (pair.getKey().equals(key)) {
                    if (previous != null) {
                        previous.next = pair.next;
                    } else {
                        previous = pair.next;
                        hashArr[index] = previous;
                    }
                    pointer--;
                    return pair.getValue();
                }
                previous = pair;
                pair = pair.next;
            }
        }
        return null;
    }

    @Override
    public String get(String key) {
        if (key == null) {
            return null;
        }
        int index = hashing(key);
        KeyValue<K, V> pair = hashArr[index];
        while (pair != null) {
            if (pair.getKey().equals(key)) {
                return pair.getValue();
            }
            pair = pair.next;
        }
        return null;
    }

    public int size() {
        return pointer;
    }

    public void resize(int newLength) {
        hashArr = Arrays.copyOf(hashArr, newLength);
    }

    public int hashing(String key) {
        int i = key.hashCode();
        int hash = (key == null) ? 0 : i;
        int index = hash & (hashArr.length - 1);
        return index;
    }

    public void print() {
        for (int i = hashArr.length; i-- > 0; ) {
            for (KeyValue<K, V> pair = hashArr[i]; pair != null; pair = pair.next) {
                System.out.println(pair.getKey() + " " + pair.getValue());
            }
        }
    }

}
