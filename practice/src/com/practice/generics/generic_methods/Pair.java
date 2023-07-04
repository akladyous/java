package com.practice.generics.generic_methods;

public class Pair <K, V>{
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                       "key=" + key +
                       ", value=" + value +
                       '}';
    }

    public static void main(String[] args) {
        Pair<String, Integer> dict1 = new Pair<>("apple", 3);
        Pair<String, Integer> dict2 = new Pair<>("apple", 3);

        System.out.println(dict1);

        boolean sameObj = Util.compare(dict1,dict2);
        System.out.println(sameObj);
    }

}

