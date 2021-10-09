package com.rishabh;
/*
Various methods for printing the arraylist
and sorting
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class iterator {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5); arr.add(56); arr.add(42); arr.add(422); arr.add(41);


        //now no one use this things
        Iterator itr = arr.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + " ");
            //itr.next();         //like increment
        }

        System.out.println();

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }

        System.out.println();

        for (int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();


        //Sorting methods
        Collections.sort(arr);
        System.out.println(arr);
        Collections.sort(arr, Collections.reverseOrder());
        System.out.println(arr);


    }
}
