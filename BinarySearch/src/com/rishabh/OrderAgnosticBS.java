package com.rishabh;

public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-10,-4,-3,-2,0,1,2,3,4,5,6,18,19};
        int[] arr2 = {78,77,56,12,10,-98,-100};

        int target = -100;
        System.out.println(orderAgnosticBS(arr,target));
        System.out.println(orderAgnosticBS(arr2,target));

    }

    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        //find whether array is in ASC or DESC

        boolean isAsc = arr[start] < arr[end];
//        if (arr[start] < arr[end]) {
//            isAsc = true;
//        } else {
//            isAsc = false;
//        }

        while(start <= end){
            //int mid = (start + end)/2;  //might be possible the start + end exceeds the range of int
            //hence it may give to error
            //best way to code is
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
