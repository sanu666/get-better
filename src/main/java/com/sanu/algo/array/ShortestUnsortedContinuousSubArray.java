package com.sanu.algo.array;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubArray {

    public static void main(String[] args) {

    }

    /**
     * Given an integer array nums, you need to find one continuous subarray that if you only sort this subarray in ascending order, then the whole array will be sorted in ascending order.
     *
     * Return the shortest such subarray and output its length.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,6,4,8,10,9,15]
     * Output: 5
     * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the whole array sorted in ascending order.
     * Example 2:
     *
     * Input: nums = [1,2,3,4]
     * Output: 0
     * Example 3:
     *
     * Input: nums = [1]
     * Output: 0
     */

    public static int findUnsortedSubarray(int[] nums) {

       int[] numsClone = nums.clone();

       Arrays.sort(numsClone);
       int start=numsClone.length;
       int end=0;

       for(int i=0;i<nums.length;i++){
           if(numsClone[i]!=nums[i]){
               start=Math.min(start,i);
               end=Math.max(end,i);
           }
       }

       if(end-start>=0){
           return end-start+1;

       }
       else return 0;

    }
}
