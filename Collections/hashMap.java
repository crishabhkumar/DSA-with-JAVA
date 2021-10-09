package com.rishabh;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hmap = new HashMap<>();
        hmap.put(1,"Rishabh");
        hmap.put(2,"Vivek");
        //simple array format printing
        System.out.println(hmap);

        //printing the hashMap using iterator
        Iterator<Integer> it = hmap.keySet().iterator();
        while (it.hasNext()){   //till element is present
            int key = (int) it.next();
            System.out.println("Roll no. " + key + " Name is: " + hmap.get(key));
        }


        //Another method for iterating through hashmap
        //best for when we don't need to play with value
        for (Map.Entry me : hmap.entrySet()){
            System.out.println(me.getKey() + " : " + me.getValue());
        }

        //getting value based on key
        String var = hmap.get(2);
        System.out.println("Value at index 2 is: " + var);

        //removing value using key
        hmap.remove(1);
        System.out.println(hmap);

        //contains
        System.out.println(hmap.containsKey(2));

    }
}
