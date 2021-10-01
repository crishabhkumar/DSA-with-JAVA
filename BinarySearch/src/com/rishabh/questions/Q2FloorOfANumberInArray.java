/*
Q. Find the floor of the target number from a given array.
floor = Greatest element in the array which smaller or equal to the target value.

Example: arr = [2,3,5,9,14,16,18]

Floor(target  =5 )  = 5
Floor(target  =10 ) = 9
Floor(target  =4 )  = 3
Floor(target  =15 ) = 14
 */

package com.rishabh.questions;

public class Q2FloorOfANumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,12,14,28,100,104,105,106,120,190};
        System.out.println(floor(arr,102));
    }

    static int floor(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        if(target < arr[start]){  //if target element id smaller than the smallest element of the array
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

        return arr[end];
    }


}
