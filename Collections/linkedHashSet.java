package com.rishabh;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class linkedHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
        lhset.add(5); lhset.add(610); lhset.add(70);
        System.out.println(lhset);
        //Collections.sort(lhset);      will show error as linkedHashSet can't be sorted
        System.out.println(lhset);

        /*
        all things of LinkedHashSet are same only
        difference is LinkedHashSet maintain the insertion order
        and its element sorted only in its insertion order.
         */

    }
}
