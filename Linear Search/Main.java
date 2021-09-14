package com.rishabh;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1,5,6,7};
        int ans = LinearSearch(arr,45);
        System.out.println(ans);

    }

    //search in the array: return the index if item found
    //otherwise if item is not found return -1
    static int LinearSearch(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        //run for loop
        for (int index = 0; index < arr.length; index++) {
            //check for the element index if it is = target
            if(arr[index] == target){
                return index;
            }
        }
//this line will execute when item is not present in array
        return -1;
    }
}
