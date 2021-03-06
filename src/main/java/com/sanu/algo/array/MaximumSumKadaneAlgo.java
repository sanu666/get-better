package com.sanu.algo.array;

public class MaximumSumKadaneAlgo {


    public static int maxSubArraySum(int[] arr){
        if(arr.length==1)
            return arr[0];

        int max_sum = arr[0];
        int current_sum = arr[0];
        for(int i = 1 ; i<arr.length;i++){
            current_sum = Math.max(arr[i]+current_sum,arr[i]);
            max_sum=Math.max(current_sum,max_sum);
        }
        return max_sum;
    }

}
