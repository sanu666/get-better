package com.sanu.algo.array;

public class RemoveElement {

    public static void main(String[] args) {

    }

    /**
     *Given an integer array nums and an integer val,
     * remove all occurrences of val in nums in-place.
     *
     Input: nums = [3,2,2,3], val = 3
     Output: 2, nums = [2,2,_,_]
     Explanation: Your function should return k = 2, with the first two elements of nums being 2.
     It does not matter what you leave beyond the returned k (hence they are underscores).
     *
     *
     *
     */
    public static int removeElement(int nums[],int k){

        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=k){
                nums[index++]=nums[i];
            }
        }
        return index;

    }
}
