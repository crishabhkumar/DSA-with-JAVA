package com.rishabh;

public class concept {
    public static void main(String[] args) {
        fun(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
//        fun(n--);       //wil give stackoverflow error
        fun(--n);       //it will work
    }
}
