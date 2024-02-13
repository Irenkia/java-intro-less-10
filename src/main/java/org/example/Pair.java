package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pair<K, V> {
    public static void main(String[] args) {
        Pair pair1 = new Pair(1, 255);
        Pair pair2 = new Pair(3.0, 255.5);
        Pair pair3 = new Pair(2, "Tom");
        Pair pair4 = new Pair(2.0, "David");
        Pair pair5 = new Pair("22", "Bob");
        System.out.println(pair1);
        System.out.println(pair2);
        System.out.println(pair3);
        System.out.println(pair4);
        System.out.println(pair5);
    }
    private Object key;
    private Object value;

    public Pair(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public void setKey(Object key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj == null || getClass() != obj.getClass()){
            return false;
        }
        Pair other = (Pair) obj;
        if (key != other.getKey()){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
