package com.sanu.algo.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/two-sum/
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    public static void main(String[] args) throws Exception {

        System.out.println(Arrays.toString(twoSum(new int[]{2,7,11,15},9)));
    }

    public static int[] twoSum(int arr[], int target) throws Exception {
        HashMap<Integer,Integer> lookUpMap = new HashMap<>();
        for(int index=0;index<arr.length;index++){
            int complement = target-arr[index];
            if(!(lookUpMap.get(complement)==null))
                return new int[]{index,lookUpMap.get(complement)};
            lookUpMap.put(arr[index],index);
        }

        throw new Exception("No match found");
    }
}
