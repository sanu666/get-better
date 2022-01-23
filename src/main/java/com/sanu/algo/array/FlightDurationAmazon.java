package com.sanu.algo.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * **Unsolved**
 */
public class FlightDurationAmazon {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(findMovieLength(new int[]{27, 1,10, 39, 12, 52, 32, 67, 76},143)));
    }

    /**
     * 1. You are a in-flight movie service provider.
     * You are given a list of movie lengths and the duration of the flight.
     * Return a pair of (2) movies whose combined length is the highest
     * and is less than or equal to flight duration. If multiple such combinations are possible,
     * return the pair which has the movie of longer longest duration.
     *
     * Ex :
     *
     * MovieLengths : {27, 1,10, 39, 12, 52, 32, 67, 76}
     *
     * Flight Duration : 77.
     * The 2 possible pairs are (1,76) and (10,67), The answer is (1,76) as per the last constraint.
     */

    public static int[] findMovieLength(int nums[], int movieLength){//
        Arrays.sort(nums);
        // MovieLengths : {1,10,12,27,32,39,52,67,76}

        int start = 0;
        int end = nums.length-1;
        int[] output = new int[2];

        while (start<end){
            if(nums[start]+nums[end]==movieLength){
                if((output[1]-output[0]<(nums[end]-nums[start]))) {
                    output[0] = nums[start];
                    output[1] = nums[end];
                }
                end--;
            }
            if(nums[start]+nums[end]>movieLength) {
                end--;
            }
            if(nums[start]+nums[end]<movieLength){
                if((output[1]-output[0]<(nums[end]-nums[start]))) {
                    output[0] = nums[start];
                    output[1] = nums[end];
                }
                start++;
            }
        }

        return output;


    }

}
