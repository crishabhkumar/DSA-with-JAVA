package com.rishabh;

import java.util.Vector;

public class vector {
    public static void main(String[] args) {
        Vector vc = new Vector();
        vc.add(1);
        vc.addElement(45);
        System.out.println(vc);
        System.out.println(vc.size());
        System.out.println(vc.capacity());

        //setsize
        vc.setSize(50);
        System.out.println(vc.size());

        //contains
        System.out.println(vc.contains(45));
//        System.out.println(vc.containsAll());       its for a particular arr

        //object element at
        System.out.println(vc.elementAt(5));


        //first element
        System.out.println(vc.firstElement());
        //last element
        System.out.println(vc.lastElement());
        //returns element at
        System.out.println(vc.get(2));


        //isemepty
        System.out.println(vc.isEmpty());

        //remove element
        vc.removeElement(45);
        System.out.println(vc);
        //remove all also works here
//        vc.removeAll()

        vc.setElementAt(56,3);
        System.out.println(vc);


    }
}

