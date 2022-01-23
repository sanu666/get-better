package com.sanu.algo.array;

public class MoveZeros {

    public static void main(String[] args) {

    }

    /**
     *
     * We initialize an index signifying the index of non zero elements
     * we iterate through the array and whenever we find a non zero element we move it to the index
     * index increments
     *
     * then we just fill the rest of the array with 0s
     *
     *
     */
    public static int[] moveZerosToEnd(int[] nums){
        int index=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }
        }
        for(int i=index;i<nums.length;i++)
            nums[i]=0;
        return nums;
    }
}
