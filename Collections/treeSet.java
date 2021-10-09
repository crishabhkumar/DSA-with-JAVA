package com.rishabh;

import java.util.TreeSet;

public class treeSet {
    public static void main(String[] args) {
        TreeSet<Integer> tset = new TreeSet<>();
        tset.add(5); tset.add(45); tset.add(4); tset.add(42);
        System.out.println(tset);
        /*
        all things are same as HashSet
        only difference is it maintains ascending order inspite of insertion or random order
         */
    }
}
