package com.sanu.practice;

import java.util.Arrays;

public class TestClass2 {

    public static void main(String[] args) {

        System.out.println(peakElement(new int[]{ 1, 3, 20, 4, 1, 0 },6));

    }


    public static int peakElement(int[] arr, int n) {
        if (n == 1)
            return 0;
        if (n == 2) {
            if (arr[0] >= arr[1])
                return 0;
            else
                return 1;
        }
        if (arr[n - 1] >= arr[n - 2])
            return n - 1;

        for (int index = 1; index < n - 1; index++) {
            if (arr[index] >= arr[index - 1] && arr[index] >= arr[index + 1])
                return index;
        }

        return 0;
    }

    public static int peakElementOptimizedWithBinarySearch(int[] arr, int n){
        return 0;
    }
}