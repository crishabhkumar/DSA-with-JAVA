package com.rishabh;
import java.util.ArrayList;
import java.util.Collections;

public class arrlist {

    public static void main(String[] args) {
	// write your code here
        ArrayList<Integer> lst = new ArrayList<>();
        lst.add(5);
//        lst.add(2,7);       //index need to be present to add the element
        lst.add(0,7);
        System.out.println(lst);
        lst.add(56);
        lst.add(86);
        System.out.println(lst);
        lst.set(0,50);
        System.out.println(lst);
        lst.add(56);
        lst.add(86);
        System.out.println(lst);
        lst.remove(5);
        System.out.println(lst);

        //Iterating Arraylist
        for (int i : lst){
            System.out.print(i + " ");
        }
        System.out.println();

        //size of arraylist
        System.out.println(lst.size());

        //sorting
        Collections.sort(lst);
        System.out.println(lst);

        //get the value
        int pos = lst.get(4);
        System.out.println(pos);

        //get the index value
        System.out.println(lst.indexOf(86));

        //check of object
        System.out.println(lst.contains(56));

        lst.clear();
        System.out.println(lst);
    }
}
