package org.example;

public class KeyValue<K,V> {
    private String key;
    private String value;
    KeyValue<K, V> next;

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        KeyValue other = (KeyValue) obj;
        if (key != other.getKey())
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        return key.hashCode();
    }
}
