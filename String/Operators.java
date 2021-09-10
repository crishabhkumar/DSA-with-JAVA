package com.rishabh;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');  //converting it into integer value and adding it
        System.out.println("a" + "b");  //concatenated the string

        System.out.println('a' + 3);    //give integer sum
        System.out.println((char)('a' + 3));       //casting ot string

        System.out.println("a" + 1);
        //this is same as after a few steps : "a" + "1"
        //integer will be converted to integer that will call toString()


        System.out.println("Rishabh" + new ArrayList<>());
        //this is same as a few steps : "Rishabh" + "[]"

        System.out.println("Rishabh" + new Integer(56));
        //this is same as few steps : "Rishabh" + "56"

//        System.out.println(new ArrayList<>() + new Integer(56));
        //error
        //coz + operaotr is defined for complex and primitives.
        //and in complex combination one of must be integer
        System.out.println(new ArrayList<>() + "" + new Integer(56));
        //this will not show error coz there is a string.

        System.out.println("a");




    }
}
