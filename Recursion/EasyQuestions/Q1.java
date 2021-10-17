package com.rishabh.EasyQuestions;
//Print numbers from n to 1
//Print numbers from 1 to n
public class Q1 {
    public static void main(String[] args) {
        int n = 5;
        print(n);
        System.out.println("_______");
        printRev(n);
        System.out.println("_______");
        printBoth(n);
    }

    //function for n to 1
    static void print(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        print(n-1);
    }

    //function for 1 to n
    static void printRev(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        printRev(n-1);
        System.out.println(n);
    }

    //function for n to 1 to n
    static void printBoth(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }


}
