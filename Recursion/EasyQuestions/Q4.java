package com.rishabh.EasyQuestions;
//Sum of digits
public class Q4 {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOfDigits(n));
    }

    static int sumOfDigits(int n){
        if(n == 0){
            return 0;
        }
        return (n % 10) + sumOfDigits(n / 10);
        //or else
//        int rem = n % 10;
//        int digit = sumOfDigits(n / 10);
//        return rem + digit;
    }
}
