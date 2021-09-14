package com.rishabh;

import java.util.Arrays;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Rishabh";
        System.out.println(search(name));

        System.out.println(Arrays.toString(name.toCharArray()));

    }

    static boolean search(String str){
        if(str.length() == 0){
            return false;
        }

        for(char ch : str.toCharArray()){
            if(ch == 'h'){
                return true;
            }
        }
        return false;
    }
//    static boolean search(String str){
//        if(str.length() == 0){
//            return false;
//        }
//
//        for (int i = 0; i < str.length(); i++) {
//            if(str.charAt(i) == 'o'){
//                return true;
//            }
//        }
//        return false;
//    }
}
