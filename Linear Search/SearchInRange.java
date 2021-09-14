package com.rishabh;

public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {4,5,6,3,8,5,9};
        System.out.println(LinearSearch(arr,3,2,6));


    }

    static int LinearSearch(int[] arr,int target,int start,int end){
        if(arr.length == 0){
            return -1;
        }

        //run for loop
        for (int index = start; index <= end; index++) {
            //check for the element index if it is = target
            if(arr[index] == target){
                return index;
            }
        }
//this line will execute when item is not present in array
        return -1;
    }
}
