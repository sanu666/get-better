package com.sanu.algo.array;

import java.util.Arrays;

public class TwoSumWithSortedArray {

    public static void main(String[] args) {

            System.out.println(Arrays.toString(twoSumSorted(new int[]{2,7,11,15},9)));
    }

    /**
     * Adding a scenario to twoSum where we have a sorted array
     * Since the array is sorted we can take two pointer approach to find the sum
     * if the sum of first and last is greater, move back end by 1
     * else start ahead by 1
     *
     * repeat this till you fins the sum
     */
    public static int[] twoSumSorted(int nums[],int target){

        int start = 0;
        int end=nums.length-1;

        while(start<end){
            if(nums[start]+nums[end]==target)
                return new int[]{start+1,end+1};
            if(nums[start]+nums[end]>target)
                end--;
            else
                start++;
        }
        throw new UnsupportedOperationException("No Such Combination Exist");

    }
}
