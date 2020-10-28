package com.rakovets.course.javabasics.practice.generics;

public class Pair<K, V> {
    private K key;
    private V value;

    Pair(K key, V value) {
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
