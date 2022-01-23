package com.sanu.algo.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf {

    public static void main(String[] args) {

        System.out.print(Arrays.toString(productArrayExceptSelf(new int[]{1,2,3,4})));

    }

    /**
     * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
     *
     * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
     *
     * You must write an algorithm that runs in O(n) time and without using the division operation.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     * Example 2:
     *
     * Input: nums = [-1,1,0,-3,3]
     * Output: [0,0,9,0,0]
     *
     * Just use 2 arrays to store products going from left to right
     * and right to left, the final output will have the product of each element
     * inside each arrays
     */

    public static int[] productArrayExceptSelf(int nums[]){
        int[] leftProduct = new int[nums.length];
        int[] rightProduct = new int[nums.length];
        int leftProd=1;
        int rightProd=1;

        for(int i=0;i<nums.length;i++){

            leftProduct[i]=leftProd;
            leftProd*=nums[i];


            rightProduct[nums.length-1-i]=rightProd;
            rightProd*=nums[nums.length-1-i];
        }

        for(int i=0;i<nums.length;i++){
            leftProduct[i]*=rightProduct[i];
        }
        return leftProduct;

    }

}
