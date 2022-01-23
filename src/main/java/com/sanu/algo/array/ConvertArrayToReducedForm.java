package com.sanu.algo.array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array with n distinct elements, convert the given array to a form where all elements are in the range from 0 to n-1. The order of elements is the same, i.e., 0 is placed in the place of the smallest element, 1 is placed for the second smallest element, … n-1 is placed for the largest element.
 *
 * Input:  arr[] = {10, 40, 20}
 * Output: arr[] = {0, 2, 1}
 *
 * Input:  arr[] = {5, 10, 40, 30, 20}
 * Output: arr[] = {0, 1, 4, 3, 2}
 */
public class ConvertArrayToReducedForm {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(reduced(new int[]{5, 10, 40, 30, 20})));
        System.out.println(Arrays.toString(reduced(new int[]{10, 40, 20})));

    }

    /**
     * So what I can see is the reduced array denotes the rank of each element in sorted form.
     * So what I do first? I clone and sort the array
     */
    public static int[] reduced(int[] arr){
        int[] clone = arr.clone(); //* Input:  arr[] = {10, 40, 20}

        Arrays.sort(clone);// Sorted {10, 40, 20} what I need is {0,1,2}

        HashMap<Integer,Integer> sortedElementToIndexMap = new HashMap<>();

        int index;
        for(index=0;index<arr.length;index++){
            sortedElementToIndexMap.put(clone[index],index); // so I created a map with ["10,0","20,1",40,2"]
        }

        for(index=0;index<arr.length;index++){
            arr[index]=sortedElementToIndexMap.get(arr[index]);
        }

        return arr;

    }
}
