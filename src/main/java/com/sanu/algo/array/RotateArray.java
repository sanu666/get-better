package com.sanu.algo.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
        rotateArrayBetter(new int[]{1,2,3,4,5,6,7},3);


    }

    /**
     *
     *
     * Given an array, rotate the array to the right by k steps, where k is non-negative.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output:       [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     *
     *
     * take temp = [1,2,3,4,5,6,7], k = 3
     *  nums =     [5,6,7,1,2,3,4]
     */

    public static void rotate(int[] nums, int k) {

        k=k%nums.length;

        int[] output= nums.clone();
        for(int i=0;i<nums.length;i++){
            nums[(i+k)%(nums.length)]=output[i];
        }
        System.out.println(Arrays.toString(nums));
    }

    /**
     *
     * Solution without using extra space:
     *
     * input                   [1,2,3,4,5,6,7], k=3
     * so we rotate the array  [7,6,5,4,3,2,1]
     * we reverse first k ele  [5,6,7,4,3,2,1]
     * we reverse last n-k ele [5,6,7,1,2,3,4]
     */

    public static void rotateArrayBetter(int nums[],int k){
        k=k%nums.length;

        reverse(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums,0,k-1);
        System.out.println(Arrays.toString(nums));
        reverse(nums,k,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }

    private static void reverse(int[] nums, int start, int end) {

        while(start<end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }

    }


}
