package com.rishabh;

import java.util.Arrays;
import java.util.Locale;

public class Methods {
    public static void main(String[] args) {
        String name = "Rishabh";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name);
        System.out.println(name.indexOf('h'));

        System.out.println("     Riahb ".strip());

        name = "Rishabh Kumar";
        System.out.println(Arrays.toString(name.split(" ")));

    }

}
