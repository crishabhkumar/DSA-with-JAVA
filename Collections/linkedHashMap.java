package com.rishabh;

import java.util.LinkedHashMap;
import java.util.Map;

public class linkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<>();
        lhmap.put(101,"Rishabh"); lhmap.put(1022,"Vivek"); lhmap.put(1030,"Priyanshu"); lhmap.put(14,"Aman"); lhmap.put(10500,"Anajli");

        for(Map.Entry me : lhmap.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }
    }
}
