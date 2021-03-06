package com.github.zelinf.tree_bench.dictionary.impl;

import java.util.Comparator;
import java.util.Map;

public class Entry<K, V> implements Map.Entry<K, V>, Comparable<Map.Entry<K, V>> {

    private K key;
    private V value;

    public Entry(K key, V value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public K getKey() {
        return key;
    }

    @Override
    public V getValue() {
        return value;
    }

    @Override
    public V setValue(V value) {
        this.value = value;
        return value;
    }

    @Override
    @SuppressWarnings("unchecked")
    public int compareTo(Map.Entry<K, V> entry) {
        Comparable<? super K> cKey = (Comparable<? super K>) key;
        return cKey.compareTo(entry.getKey());
    }
}
