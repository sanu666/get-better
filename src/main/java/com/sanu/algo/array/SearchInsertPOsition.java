package com.sanu.algo.array;

public class SearchInsertPOsition {

    public static void main(String[] args) {

    }

    /**
     * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
     *
     * You must write an algorithm with O(log n) runtime complexity.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [1,3,5,6], target = 5
     * Output: 2
     * Example 2:
     *
     * Input: nums = [1,3,5,6], target = 2
     * Output: 1
     * Example 3:
     *
     * Input: nums = [1,3,5,6], target = 7
     * Output: 4
     *
     *
     * Solution:- simple Binary Search just return the low and check for boundary conditions
     */

    public static int searchInsert(int[] nums, int target) {

        int low=0;
        int high=nums.length-1;

        if(target>nums[nums.length-1])
            return nums.length;
        if(target<nums[0])
            return 0;


        while(low<=high){
            int mid =low+(high-low)/2;

            if(target==nums[mid])
                return mid;
            if(target>nums[mid]){
                low=mid+1;
            } else{
                high=mid-1;
            }
        }
        return low;

    }
}
