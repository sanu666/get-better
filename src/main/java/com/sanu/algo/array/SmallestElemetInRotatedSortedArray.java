package com.sanu.algo.array;

public class SmallestElemetInRotatedSortedArray {

    /**
     * Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
     *
     * [4,5,6,7,0,1,2] if it was rotated 4 times.
         * [0,1,2,4,5,6,7] if it was rotated 7 times.
     * Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
     *
     * Given the sorted rotated array nums of unique elements, return the minimum element of this array.
     *
     * You must write an algorithm that runs in O(log n) time.
     *
     * https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
     */

    public static void main(String[] args) {

        System.out.println(findElementInRotatedArray(new int[]{4,5,6,7,0,1,2}));

    }

    /**
     * We will use a modified version of binary search where we would
     * 1. Calculate the mid
     * 2. If nums[mid]<nums[mid-1] return nums[mid] since that would be the point where sorting breaks. (check for underflow as well)
     * 3. Now we use binary search approach to eliminate either half.
     * 4. We do this by checking if the element at mid is greater than the last and greater than the first
     *    this means the element is at the right half, so we adjust the low to mid+1
     * 5. If it's false we eliminate the other half.
     */
    public static int findElementInRotatedArray(int[] arr) {

        if (arr.length == 0)
            return -1;
        if (arr.length == 1)
            return arr[0];

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            if (mid > 0 && arr[mid] < arr[mid - 1])
                return arr[mid];

            if (arr[low] <= arr[mid] && arr[mid]>arr[high]) {
                low = mid +1;
            } else {
                high = mid -1;
            }

        }
        return arr[low];
    }
}
