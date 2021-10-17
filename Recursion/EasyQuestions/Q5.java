package com.rishabh.EasyQuestions;

public class Q5 {
    public static void main(String[] args) {
        int n = 505;
        System.out.println(productOfDigits(n));
    }

    static int productOfDigits(int n){
        if(n == 0){
            return 1;
        }
        return (n % 10) * productOfDigits(n / 10);
        //or else
//        int rem = n % 10;
//        int digit = productOfDigits(n / 10);
//        return rem * digit;
    }
}
