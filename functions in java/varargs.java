package com.rishabh;

import java.util.Arrays;

//varargs means when we don't how many input we are going to give
public class varargs {
    public static void main(String[] args) {
////        fun(2,3,2,3,23,2,3,2);
//        fun(2,3,2,3,23,2,3,2);
        //fun();

//        multiple(4,8,"Rahul","Rishabh","shudsajdoas");

        //demo();
       // demo(); //error ambiquity error can't be empty
        demo(78);

    }


    static void demo(int ...v){
        System.out.println(v);

    }
    static  void demo(String ...v){
        System.out.println(v);
    }



//    //varargs always come at last in argument
//    static void multiple(int a,int b,String ...v){
//
//
//    }

//
//    static void fun(int ...v){
//        System.out.println(Arrays.toString(v));
//    }
}
