/*
Given a characters array letters
that is sorted in non-decreasing order and a character target,
return the smallest character in the array that is larger than target.
Input: letters = ["c","f","j"], target = "a"
Output: "c"
Input: letters = ["c","f","j"], target = "c"
Output: "f"

 */

/*
Approach:
1.Exact same approach for ceiling of no.
2.Ignore the target = coz we are nor looking for that one
3.arr = ["c","f","j"], target = "j"    return = c
//we can do 3 by modulo

condition violated start = end+1 = length of array = N
 */

package com.rishabh.questions;

public class Q3SmallestCharacter {
    public static void main(String[] args) {
        char[] arr = {'a','c','g','j','m'};
        char target = 'd';
        System.out.println(smallchar(arr,target));

    }

    static char smallchar(char[] arr,char target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid + 1;
            }
        }

//        if(start == arr.length){
//            return arr[0];
//        }
//        return arr[start];

        //or we can do by this way also
        return arr[start % arr.length];

    }
}
