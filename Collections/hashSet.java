package com.rishabh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class hashSet {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        //boolean add
        hset.add(45); hset.add(46); hset.add(74); hset.add(41); hset.add(10);
        System.out.println(hset);

        //clone()
        hset.clone();

        //isEmpty
        System.out.println(hset.isEmpty());

        //contains()
        System.out.println(hset.contains(46));

        //size() returns the size of hashset
        System.out.println(hset.size());


        //Iteration
        for (int i : hset){
            System.out.println(i);
        }

        //conversion of hashset to array
        Integer[] arr = new Integer[hset.size()];
        hset.toArray(arr);
        System.out.println(Arrays.toString(arr));

        //conversion of hashset to array
        List<Integer> lst = new ArrayList<>(hset);
        System.out.println(lst);


        //clear()       to deleting all the elements of hashset
        hset.clear();
        System.out.println(hset);

    }
}
