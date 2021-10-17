package com.rishabh;
//Find nth Fibonacci number using recursion

public class FibonacciRecur {
    public static void main(String[] args) {
        int n = 50;
        int ans = fibo(n);
        System.out.println(ans);
    }

    static int fibo(int n){
//        if(n == 0){
//            return 0;
//        }
//        if(n == 1){
//            return 1;
//        }
        //OR
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }


    //Program for any nth fibonacci number
    static long anyFiboWithFormula(int n){
        return (long)((Math.pow(((1 + Math.sqrt(5))/2),n) - Math.pow(((1 - Math.sqrt(5))/2),n))/Math.sqrt(5));
    }
}
