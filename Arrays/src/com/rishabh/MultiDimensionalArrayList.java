package com.rishabh;

import java.util.ArrayList;
import java.util.Scanner;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        //Intialization  coz have to add the arraylist for adding the elements
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter" + " ");
                list.get(i).add(input.nextInt()); //we are taking list at index then adding the elements into it.
            }
        }

        System.out.println(list);
    }
}
