package com.sanu.algo.array;

public class RemoveDuplicateFromSortedArray {

    public static void main(String[] args) {

    }


    /**
     * Given a sorted array nums, remove the duplicates in-place such that
     * each element appears only once and returns the new length.
     *
     * Do not allocate extra space for another array,
     * you must do this by modifying the input array in-place with O(1) extra memory.
     *
     * Clarification: Confused why the returned value is an integer but your answer is an array?
     * Note that the input array is passed in by reference,
     * which means a modification to the input array will be known to the caller as well.
     *
     *
     * Input: nums = [1,1,2]
     * Output: 2, nums = [1,2]
     *
     * Input: nums = [0,0,1,1,1,2,2,3,3,4]
     * Output: 5, nums = [0,1,2,3,4]
     *
     * It doesn't matter what you leave beyond the returned length.
     */
    public static int removeDuplicates(int nums[]){

        int index=1; //This represents the position where we should place a unique number that we find
        for(int i=0;i<nums.length-1;i++){//so we wanna compare ith element with i+1th element
            if(nums[i]!=nums[i+1]){
                nums[index++]=nums[i+1];
            }
        }
        return index;

    }
}
