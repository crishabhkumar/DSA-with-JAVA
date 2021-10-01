package com.rishabh;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    //dynamic array type
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        //list type<storing type> var name = new list type <>(size);

//        list.add(87);
//        list.add(75);
//        list.add(8856);
//        list.add(84521);
//        list.add(8788);
//        list.add(845521);
//        System.out.println(list);
//        System.out.println(list.contains(75));
//        System.out.println(list);
//        list.add(0,99);
//        System.out.println(list);
//        list.set(0,78);
//        System.out.println(list);
//
//

        //Input
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter:");
            list.add(input.nextInt());
        }
        System.out.println(list);
        //get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.print(list.get(i) + " ");  //pass index here , list[index] will not work here.
        }

        System.out.println(list);



    }
}
