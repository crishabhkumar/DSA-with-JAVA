package com.rishabh.questions;

public class Q6FindPeakElement {
    public static void main(String[] args) {
        int[] arr = {0,2,1,0};
        System.out.println("Maximum element is :" + binarySearch(arr));

    }

    static int binarySearch(int[] arr){
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
        //in the end,start == end
        //pointing to the largest number because of the 2 checks


        return arr[start];
    }

}


