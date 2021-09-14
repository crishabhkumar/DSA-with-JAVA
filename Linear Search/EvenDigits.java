package com.rishabh;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = {12,256,123,14,85,961,4564};
        System.out.println(findNumbers(nums));



    }

    static int findNumbers(int[] nums){
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int digits = 0;
            while (nums[i] != 0){
                nums[i] = nums[i] /10;
                digits++;
            }
            if(digits % 2 == 0){
                count++;
            }
        }
        return count;
    }

}
