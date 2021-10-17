package com.rishabh.EasyQuestions;
//sum of a numbers from n to 1
public class Q3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumOFN(n));
    }

    static int sumOFN(int n){
        if (n == 1){
            return 1;
        }
        return n + sumOFN(n-1);
    }

}
