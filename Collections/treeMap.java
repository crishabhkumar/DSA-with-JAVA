package com.rishabh;

import java.util.Map;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap = new TreeMap<>();
        tmap.put(101,"Rishabh"); tmap.put(1022,"Vivek"); tmap.put(1030,"Priyanshu"); tmap.put(14,"Aman"); tmap.put(10500,"Anajli");

        for (Map.Entry me : tmap.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        /*
        all methods are same as hashmap
         */
    }
}
