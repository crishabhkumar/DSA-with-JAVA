package com.rishabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /*
        synatx of if stattement
        if(boolean expresssion T or f){
            //body
        }
        else{
            //do this
            }
         */
        Scanner input = new Scanner(System.in);
        int salary = 24500;
//        if(salary > 5000){
//            salary += 4000;
//        }else {
//             salary+=5000;
//        }


        //Multiple if-else condition
        if(salary > 40500){
            salary += 45500;
        }else if(salary > 4500 ){
            salary += 45000;
        }else{
            salary += 4500;
        }

        System.out.println(salary);


    }
}
