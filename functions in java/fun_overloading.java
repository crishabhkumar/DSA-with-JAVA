package com.rishabh;

public class fun_overloading {
    public static void main(String[] args) {
//        fun(89);
//        fun(878956);
        //fun("Rishabh");
        System.out.println(sum(78,78));
        System.out.println(sum(78,54,48));
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String j){
        System.out.println(j);
    }


    static int sum(int a,int b){
        return a+b;
    }
    static int sum(int a,int b,int c){
        return a+b+c;

    }
}
