package com.sanu.algo.array;

public class MaaxSumOfNonConsecutiveElements {

    public static void main(String[] args) {

        System.out.print(maxSumNonConsecutiveElement(new int[]{5, 5, 10, 100, 10, 5}));

    }

    /**
     * Maximum sum such that no two elements are adjacent | Set 2
     * Difficulty Level : Medium
     * Given an array of positive numbers, find the maximum sum of a subsequence with the constraint that no 2 numbers in the sequence should be adjacent in the array. So 3 2 7 10 should return 13 (sum of 3 and 10) or 3 2 5 10 7 should return 15 (sum of 3, 5, and 7).
     *
     * Examples:
     *
     * Input :  arr[] = {3, 5, 3}
     * Output : 6
     * Explanation :
     * Selecting indexes 0 and 2 will maximise the sum
     * i.e 3+3 = 6
     *
     * Input : arr[] = {2, 5, 2}
     * Output : 5
     *
     * Solution:- https://www.youtube.com/watch?v=SfSGoa2ck6s
     * Basically what you would need to do is use DP to store each intermediate output.
     *
     * So lets say the array has 1 element, so output will be the same element.
     * Add this element in the dparray[0]
     * If the array has 2 elements store the max of 1st and second element
     * Add this to dparray[1]
     *
     * Now the tricky part, if the array has 3 element,
     * store the max of (ith element + dp[i-2], dp[i-1])
     *
     * At the end return the last element in dp array
     */

    public static int maxSumNonConsecutiveElement(int[] nums){

        if(nums==null || nums.length==0)
            return -1;

        if(nums.length==1)
            return nums[0];

        int[] dpArray = new int[nums.length];
        dpArray[0]=nums[0];
        dpArray[1]=(nums[0]>nums[1]?nums[0]:nums[1]);

        for(int i=2;i<nums.length;i++){
            dpArray[i]=Math.max(dpArray[i-2]+nums[i],dpArray[i-1]);
        }

        return dpArray[nums.length-1];



    }


}
