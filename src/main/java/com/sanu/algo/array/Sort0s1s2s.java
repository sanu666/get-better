package com.sanu.algo.array;

public class Sort0s1s2s {

    public static void main(String[] args) {

        sortColors(new int[]{2,0,2,1,1,0});

    }

    /**
     * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
     *
     * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     *
     * You must solve this problem without using the library's sort function.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [2,0,2,1,1,0]
     * Output: [0,0,1,1,2,2]
     * Example 2:
     *
     * Input: nums = [2,0,1]
     * Output: [0,1,2]
     * @param nums
     */

    public static void sortColorsOptimized(int[] nums){
        int start = 0;
        int end = nums.length-1;

        int index = 0;

        while(index<=end && start<end){
            switch (nums[index]){
                case 0:
                    nums[index]=nums[start];
                    nums[start]=0;
                    start++;
                    index++;
                    break;
                case 2:
                    nums[index]=nums[end];
                    nums[end]=2;
                    end--;
                    break;
                default:
                    index++;
            }
        }


    }

    public static void sortColors(int[] nums) {

        int counterZeros = 0;
        int counterOnes = 0;
        int counterTwos = 0;
        for(int i=0;i<nums.length;i++){
            switch (nums[i]){
                case 0:
                    counterZeros++;
                    break;
                case 1:
                    counterOnes++;
                    break;
                case 2:
                    counterTwos++;
                    break;
            }
        }
        for(int i=0;i<counterZeros;i++)
            nums[i]=0;

        for(int i=counterZeros;i<counterOnes+counterZeros;i++)
            nums[i]=1;

        for(int i=counterOnes+counterZeros;i<counterOnes+counterZeros+counterTwos;i++)
            nums[i]=2;

    }
}
