package com.sanu.algo.array;

/**
 * An element A[i] of an array A is a peak element if it’s not smaller than its neighbor(s).
 *
 * A[i-1] <= A[i] >= A[i+1] for 0 < i < n-1
 * A[i-1] <= A[i] if i = n – 1
 * A[i] >= A[i+1] if i = 0
 * For example,
 *
 * Input : [8, 9, 10, 2, 5, 6]
 * Output: The peak element is 10 (or 6)
 *
 *
 * Input : [8, 9, 10, 12, 15]
 * Output: The peak element is 15
 *
 *
 * Input : [10, 8, 6, 5, 3, 2]
 * Output: The peak element is 10
 */
public class PeakElement {
    public static void main(String[] args) {

//        System.out.println(peakElement(new int[]{ 1, 3, 20, 4, 1, 0 },6));
        System.out.println(peakElementOptimizedWithBinarySearch(new int[]{ 1, 3, 20, 4, 1, 0 },6));

    }

    // looking at the inputs we can see, the peak element is the last element if array is sorted in asc order.
    // Looking further if the peak element is somewhere in the middle, then the array is sorted till that element

    /**
     *  So what do we do?
     * a. If the middle element is greater than both neighbours then we return the middle element.
     * b. If the middle element is smaller than the left neighbour, then the peak element must be in the left half of the array.
     * c. If the middle element is smaller than the right neighbour, then peak element must be in right half of the array.
     */
    public static int peakElementOptimizedWithBinarySearch(int[] arr, int n){

        int start = 0;
        int end = arr.length-1;

        while(start<end){
            int mid = start+(end-start)/2;

            if((mid == 0 || arr[mid]>arr[mid+1]) && (arr[mid]>arr[mid-1] || mid ==end-1)){
                return mid;
            }

            if(mid>0 && arr[mid]>arr[mid-1]){
                start=mid+1;
            }
            else {
                end=mid-1;
            }

        }
        return -1;

    }

// This is just a linear traversal soln.
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


}
