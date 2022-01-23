package com.sanu.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
 *
 *
 *
 * Example 1:
 *https://leetcode.com/problems/trapping-rain-water/
 *
 * Youtube solution:- https://www.youtube.com/watch?v=ZI2z5pq0TqA
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 */
public class TrapRainWater {

    public static void main(String[] args) {

        System.out.println(getTrappedRainWater(new int[]{4,2,0,3,2,5}));

    }

    //So basically we traverse the array and for each index we see 2 things,
    //1. what is the max element to it's left.
    //2. what is the max element to it's right.
    //3. The min of (1 & 2) - the height of the element if greater than 0 will be the amount of water to be stored
    public static int getTrappedRainWater(int[] arr){

        if(arr.length<3)
            return 0;
        int totalWaterStored=0;
        for(int index=1;index<arr.length-1; index++){

            int leftMax = maxInArray(Arrays.copyOfRange(arr,0,index));
            int rightMax = maxInArray(Arrays.copyOfRange(arr,index+1,arr.length));
            int individualBlockWater = Math.min(leftMax, rightMax) - arr[index];
            if(individualBlockWater>0)
                totalWaterStored+=individualBlockWater;
        }

        return totalWaterStored;
    }

    public static int maxInArray(int arr[]){
        int max = 0;
        for(int element:arr){
            if(element>max)
                max=element;
        }
        return max;
    }


}
