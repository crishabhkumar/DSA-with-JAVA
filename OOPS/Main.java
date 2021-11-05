package com.rishabh;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Q = store 5 roll nos.
        int[] numbers = new int[5];

        //Q = store five names
        String[] names = new String[5];

        //Q = data of five students : {roll no,name,marks}
        //we can do this
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //we need as
        //Student[] students = new Student[5];
        Student[] students = new Student[5];
//        System.out.println(Arrays.toString(students));


//        Student rishabh;    //declaration of reference //object not created
        //just stored in stack memory
        //now
//        rishabh = new Student();

        Student rishabh = new Student();
//        rishabh.name = "Rishabh";
//        rishabh.rno = 50;
//        rishabh.marks = 4500.65f;

        System.out.println(rishabh.rno);
        System.out.println(rishabh.name);
        System.out.println(rishabh.marks);
        rishabh.changeName("Raghav");
        rishabh.greeting();


        Student raghav = new Student(4,"Raghav",98.9f);

    }
}

//create a class
class Student{
    int rno;
    String name;
    float marks;


    //we need a way to add the values of the above
    // properties object by object

    //we need one word to access every object

    Student(){      //default constructor
        this.name = "Rishabh";
        this.rno = 50;
        this.marks = 4500.65f;
    }


    void greeting(){
        System.out.println("Hello! my name is "+ name);
        //this.name means object.name
        //that's why this.name will work same as name
        //or it is imagining this. is already present here.
    }

    void changeName(String newName){
        name = newName;
    }

    Student(int roll,String name,float marks){      //parametrized constructor
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    Student (Student other){
        this.rno = other.rno;
        this.name = other.name;
        this.marks = other.marks;
    }




}
