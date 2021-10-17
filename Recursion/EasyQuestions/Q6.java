package com.rishabh.EasyQuestions;
//Reverse a number using recursion
public class Q6 {
    public static void main(String[] args) {
//        revNumber(56389);
        System.out.println(revNumber(1824));
    }

    int sum = 0;
    static int revNumber(int n){
        if(n % 10 == n){
            return n;
        }
        int rem = n % 10;
        int reversedNumber = revNumber(n / 10);
        return rem + reversedNumber;
    }
}
