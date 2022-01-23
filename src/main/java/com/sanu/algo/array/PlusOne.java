package com.sanu.algo.array;

public class PlusOne {
    public static void main(String[] args) {

    }

    /**
     *
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.
     *
     * Increment the large integer by one and return the resulting array of digits.
     *
     *
     *
     * Example 1:
     *
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Incrementing by one gives 123 + 1 = 124.
     * Thus, the result should be [1,2,4].
     * Example 2:
     *
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Incrementing by one gives 4321 + 1 = 4322.
     * Thus, the result should be [4,3,2,2].
     *
     *
     * Solution:- simple really, we iterate from the back, if we dont find a nine we add one to the end and return
     * if we do find 9 at then end we set the elemt  to 0
     *
     * now if we are coming out of the loop, means all units were 9, i. 9999, 99 etc
     *
     * so basically we need to resize the array and create a new one with +1 elemnts and just add 1 at the beginning
     *
     */

    public int[] plusOne(int[] digits) {

        for(int i=digits.length-1;i>-1;i--){
            if(digits[i]!=9){
                digits[i]=digits[i]+1;
                return digits;
            }
            digits[i]=0;

        }

        int[] output = new int[digits.length+1];
        output[0]=1;
        return output;

    }
}
