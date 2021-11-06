package com.rishabh;

public class WrapperClassExamples {
    public static void main(String[] args) {
//        int a = 10;     //primitve data type stored in stack
//        int b = 20;
//        swap(a,b);            this will not swap
//        System.out.println(a + " " + b);
        Integer num = 45;   //object of wrapper class Integer
        //stored in heap




        Integer a = 10;
        Integer b = 20;
        swap(a,b);            //this will also not swapped
        System.out.println(a + " " + b);



        final A rishabh = new A("Rishabh");
        rishabh.name = "Raghav";
//        rishabh = new A(" new name");   //can't do this
        //when a non primitive is final, you cannot reassign it.

        A obj;
        for (int i = 0; i < 100000000; i++){
            obj = new A("Random name");
        }

        



    }
//    static void swap(int a,int b){      //this will not swap
//        //as in java there is nothing called pass by reference
//        int temp = a;
//        a = b;
//        b = temp;
//    }


    static void swap(Integer a,Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }

}


class A {
//    final int num;      //final variables has to be intialized
//    final int num = 5;
    String name;

    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        //a type of destructor in java
        //only calls when heap memory need garbage collector works
        System.out.println("Object is destroyed");
    }
}

