package com.rishabh;

public class Main {

    public static void main(String[] args) {
	// Q1. store roll no.
        int a = 46;
        //Q2 . store a person's name
        String name = "Rishabh";

        //Q3. store five roll no.
//        int rno1 = 1;
//        int rno2 = 2;
//        int rno3 = 5;
//        int rno4 = 58;
//        int rno5 = 89
        //No we will not do like this

        //ARRAY
        /*
        SYNATAx
        //below array declaration syntax
        datatype[] variable_name = new datatype[size];
         */

//        int [] rno = new int[5];
//        // or directly
//        int [] rno2 = {23,45,78,89,75};
//        //you can't make mix datatype array
//        //it must be a unique datatype
//
// happens at compile time        int [] ros; //declaration of array. ros is getting defined in the stack
// happens at runtime = dynamic memory allocation        ros = new int[89]; //initialization //actually memory creation = here object is being created in the memory


//        int[] ros;
//        ros = new int[5];
//        System.out.println(ros[4]);


        String[] arr = new String[4];
        System.out.println(arr[0]);

//        String x = null; //only assign to non-primitive
//        int num = null;     //cant assign to primitive
        //any reference variable automatically have null value till you not assign it
        //you can typecast null to any reference value


        //enchanced for loop
//        for(String element:arr){
//            System.out.println(element);
//        }



    }
}
