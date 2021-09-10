package com.rishabh;

public class willReturnString {
    public static void main(String[] args) {
        String msg = greeting("Rishabh");
        System.out.println(msg);
    }
//    static String greeting(){
//        String greeting = "How are you?";
//        return greeting;
//
//    }


    static String greeting(String str){
        String msg = "Hello " + str;
        return msg;
    }
}
