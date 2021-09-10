package com.rishabh;

public class Comparison {
    public static void main(String[] args) {
        String a = "Rishabh";
        String b = "Rishabh";
        String c = a;
//        System.out.println(c == a); //gives true
//
//        System.out.println(a == b); //gives true

        String name = new String("Rishabh");
        String name2 = new String("Rishabh");

//        System.out.println(name == name2);//gives false
        //coz it check who is pointing whom

        System.out.println(name.equals(name2));  //gives true
        //coz it cares of value not referencing or pointing

       // System.out.println(name[0]);        //can't do this

        System.out.println(name.charAt(0));



    }

}
