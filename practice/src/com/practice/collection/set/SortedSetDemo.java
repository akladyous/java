package com.practice.collection.set;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetDemo {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        TreeSet<String> treeSet = new TreeSet<>();
        NavigableSet<String> navigableSet = new TreeSet<>();

        treeSet.first();
        treeSet.last();
        treeSet.headSet("first");

    }


}
