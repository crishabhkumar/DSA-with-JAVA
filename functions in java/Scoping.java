package com.rishabh;

//scoping = where we can access our variables
public class Scoping {
    public static void main(String[] args) {
        int a = 20;
        int b = 211;
     //   random();

        //block scoping
        //anything intialise in it you can use it only in it
        //but anything which is intiliazed outside you can use it in it.
        {
            a = 54; //we can reassign to alreay intialized variable
            int c = 9;
            //value intialized in this block will only valid in this block
            //means you can use this only in this
        }
        int c = 900;
    //    c  = 58; //cant do annything
    //    System.out.println(c);   //will show error


        for (int i = 0; i< 5; i++) {
            System.out.println(i);
            int num = 56;
            a = 4555;

        }


        System.out.println(a);






    }
    static void random(){
        int num = 5;
        System.out.println(num);
        System.out.println(num);
    }
}
