package com.rishabh;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 563;
        swap(a,b);
//        int temp = a;
//        a = b;
//        b = temp;

        System.out.println(a + " " + b);

        String name = "Rishabh Chaudhary";
        changename(name);
        System.out.println(name);



     }
    static void changename(String naam){
        naam = "Raghav kumar";  //creating new object
    }


    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;


        //this change wil only be valid in this function scop
    }
}
