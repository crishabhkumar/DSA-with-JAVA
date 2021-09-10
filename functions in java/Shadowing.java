package com.rishabh;

public class Shadowing {
    static int x = 55;   //static is only object independent
    //this will shadow at line 8
    public static void main(String[] args) {
        System.out.println(x);  //55
        int x;  //the class variable at line 4 is shadowed by this value.
        //shadowing will begin when value is initialised
        //System.out.println(x);   //shows error
        x = 40;
        System.out.println(x);  //45
        fun();

    }

    static void fun(){
        System.out.println(x);
    }


}


