/*
Q. Find the ceiling value of the target number from a given array.
ceiling value = smallest element in the array which greater or equal to the target value.

Example: arr = [2,3,5,9,14,16,18]

Ceiling Value(target  =5)  = 5
Ceiling Value(target  =10) = 14
Ceiling Value(target  =4)  = 5
Ceiling Value(target  =15) = 16
 */
package com.rishabh.questions;

public class Q1CeilingOfANumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,12,14,28,100,104,105,106,120,190};
        System.out.println(ceiling(arr,14 ));
    }


    static int ceiling(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        if(target > arr[arr.length - 1]){  //when target is greater than the greatest element of the array
            return 0;
        }
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }else{
                return arr[mid];
            }
        }

        return arr[start];
    }


}
