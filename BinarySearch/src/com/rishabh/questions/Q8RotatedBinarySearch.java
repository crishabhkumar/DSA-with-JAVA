package com.rishabh.questions;

import java.util.ArrayList;

public class Q8RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1};
        int target  = 0 ;
        System.out.println(findPivot(nums));
        System.out.println("Element at:" + pivotBinarySearch(nums,target));

    }
    static int findPivot(int[] arr){
        if(arr.length == 0 || arr.length == 1) return arr[0];
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid + 1] < arr[mid] && end > mid){
                return mid;
            }
            if (arr[mid-1] > arr[mid]){
                return mid - 1;
            }
            if(arr[start] >= arr[mid]){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
        }
        return -1;
    }

    static int pivotBinarySearch(int[] arr,int target){
        int pivot = findPivot(arr);
        //if pivot == -1 means array is not rotated
        //then simple binary search will work
        if(pivot == -1){
            return binarySearch(arr,target,0, arr.length-1);
        }

        //if pivot is found  we have 2 asc sorted arays
        if(arr[pivot] == target){
            return pivot;
        }
        if(arr[0] <= target){
            return binarySearch(arr,target,0,pivot-1);
        }else {
            return binarySearch(arr,target,pivot+1,arr.length -1 );
        }
    }
    static int binarySearch(int[] arr,int target,int start,int end){
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
            ArrayList<Integer> list = new ArrayList<>();
            list.ad
        }
        return -1;
    }

}
