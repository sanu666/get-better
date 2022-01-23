package com.sanu.algo.array;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = new int[]{1,2,3,9,99};
        int[] nums2 = new int[]{2,8,45};
        System.out.println(Arrays.toString(mergeSortedArray(nums1,5,nums2,3)));

    }

    public static int[] mergeSortedArray(int nums1[],int m, int nums2[], int n){
        int[] output = new int[n+m];
        int i=0;
        int j=0;
        int k=0;

        while(i<m && j<n){
            if(nums1[i]<nums2[j]){
                output[k++]=nums1[i++];
            }else{
                output[k++]=nums2[j++];
            }
        }
        while(i<m)
            output[k++]=nums1[i++];
        while ((j<n))
            output[k++]=nums2[j++];
        return output;

    }
}
