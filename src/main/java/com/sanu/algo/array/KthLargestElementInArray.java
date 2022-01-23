package com.sanu.algo.array;

import java.util.PriorityQueue;

public class KthLargestElementInArray {

    public static void main(String[] args) {

    }

    /**
     * Given an integer array nums and an integer k, return the kth largest element in the array.
     *
     * Note that it is the kth largest element in the sorted order, not the kth distinct element.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [3,2,1,5,6,4], k = 2
     * Output: 5
     * Example 2:
     *
     * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
     * Output: 4
     *
     * soln video:- https://www.youtube.com/watch?v=FrWq2rznPLQ
     */

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++){
            minHeap.add(nums[i]);
            if(minHeap.size()>k){
                minHeap.remove();
            }
        }
        return minHeap.remove();

    }
}
