/*
Code for BINARY SEARCH
 */
package com.rishabh;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-10,-4,-3,-2,0,1,2,3,4,5,6,18,19};
        int target = 10;
        System.out.println("Element is present at: " + binarySearch(arr,target));   //will give -1 as it is not present
        target = -10;
        System.out.println("Element is present at: " + binarySearch(arr,target));   //will give 0 as index is zero
    }

    //it will return the index
    //return -1 if it does not exist
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            //int mid = (start + end)/2;  //might be possible the start + end exceeds the range of int
            //hence it may give runtime error
            //the best way to code is
            int mid = start + (end - start) / 2;
            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                return mid; // ans = mid
            }
        }
        return -1;
    }
}
