/*
Find in Mountain Array
You may recall that an array A is a mountain array if and only if:

A.length >= 3
There exists some i with 0 < i < A.length - 1 such that:
A[0] < A[1] < ... A[i-1] < A[i]
A[i] > A[i+1] > ... > A[A.length - 1]
Given a mountain array mountainArr,
return the minimum index such that mountainArr.get(index) == target.
If such an index doesn't exist, return -1.
 */
package com.rishabh.questions;

public class Q7FindElementINMountainArray {
    public static void main(String[] args) {
        int [] nums = {0,1,2,3,4,5,3,1};
        System.out.println("Element is at:" + search(nums,2));



    }

    static int search(int[] arr,int target){
        int peak = peakElement(arr);
        int firstTry = binarySearch(arr,target,0,peak);
        if(firstTry != -1){
            return firstTry;
        }
        return binarySearch(arr,target,peak+1,arr.length-1);
    }

    static int peakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(arr[mid + 1] < arr[mid]){
                //you are in dec. part of array
                //thi smay be the ans,but look in left
                end = mid ;
            }else{
                //you are in inc. part of array
                //coz we know that mid + 1 element > mid element
                start = mid + 1;
            }
        }
        return start;
    }
    static int binarySearch(int[] arr,int target,int start,int end){
        //finding whether array is in ASC or DESC
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid -1;
                }else{
                    start = mid + 1;
                }
            }else {
                if(target > arr[mid]){
                    end = mid -1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }


}
