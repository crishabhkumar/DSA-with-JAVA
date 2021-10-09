package com.rishabh;

import java.util.ArrayList;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5); arr.add(15); arr.add(45); arr.add(50);
        LinkedList<Integer> linklist = new LinkedList<>();
        linklist.add(5); linklist.addFirst(50); linklist.addLast(46); linklist.add(2,45);
        linklist.addAll(arr);
        linklist.addAll(0,arr);
        System.out.println(linklist);

        //boolean
        boolean var = linklist.contains(5);
        System.out.println(var);

        //getValue
        System.out.println(linklist.get(4));
        System.out.println(linklist.getFirst());
        System.out.println(linklist.getLast());

        //index of
        System.out.println(linklist.indexOf(50));   //gives first index of element

        //position of elements
        System.out.println(linklist.lastIndexOf(50));

        //returns and removes the element
        System.out.println(linklist.poll());    //works on firsst element
        System.out.println(linklist.pollFirst());
        System.out.println(linklist.pollLast());

        //linkedList
        System.out.println(linklist);


        //remove function
        linklist.remove();
        System.out.println(linklist);
        linklist.remove(5);
        linklist.removeFirst();
        linklist.removeLast();
        System.out.println(linklist);
        linklist.add(50); linklist.add(15);
        linklist.removeFirstOccurrence(50);
        linklist.removeLastOccurrence(15);
        System.out.println(linklist);


        //returns the length of linkedList
        System.out.println(linklist.size());

        //set function
        linklist.set(0,50);     //updates the value of linkedList
        System.out.println(linklist);

        //peeking
        System.out.println(linklist.peek());
        System.out.println(linklist.peekFirst());
        System.out.println(linklist.peekLast());



    }
}
