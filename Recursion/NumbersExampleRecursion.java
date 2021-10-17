package com.rishabh;
//Example for Recursion
public class NumbersExampleRecursion {
    public static void main(String[] args) {
        //waf that takes in a number and prints it
        //print first 5 numbers
        print(1);
    }
    static void print(int n){
        if(n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        //recursive call
        //every call will be treated as a separate call in the stack
        print(n + 1);
    }

}
