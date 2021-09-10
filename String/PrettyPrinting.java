package com.rishabh;

public class PrettyPrinting {
    public static void main(String[] args) {
        float a = 452.2675f;
        System.out.printf("Formatted number is %.2f",a);
        //printf = formatted print stream
        //%.2f its automatically round off also

        System.out.println();
        System.out.printf("Pie = %.3f",Math.PI);

        System.out.println();

        System.out.printf("Hello my name is %s and I am %s","Rishabh","Smart");
    }
}
