package com.sanu.algo.array;

import java.util.HashMap;

/**
 * Given an array a that contains only numbers in the range from 1 to a.length,
 * find the first duplicate number for which the second occurrence has the minimal index.
 * In other words, if there are more than 1 duplicated numbers, return the number for which
 * the second occurrence has a smaller index than the second occurrence of the other number does.
 *
 * If there are no such elements, return -1.
 *
 *
 * For a = [2, 1, 3, 5, 3, 2], the output should be
 * firstDuplicate(a) = 3.
 *
 * There are 2 duplicates: numbers 2 and 3. The second occurrence of 3 has a smaller index than the second occurrence of 2 does, so the answer is 3.
 *
 * For a = [2, 4, 3, 5, 1], the output should be
 * firstDuplicate(a) = -1.
 * Solution https://www.youtube.com/watch?v=XSdr_O-XVRQ
 */
public class FirstDuplicateCodeSignal {

    public static void main(String[] args) {
        System.out.println(firstDuplicate(new int[]{2, 1, 3, 5, 3, 2}));
        System.out.println(firstDuplicate(new int[]{2, 4, 3, 5, 1}));

        System.out.println(firstDuplicateOptimized(new int[]{2, 1, 3, 5, 3, 2}));
        System.out.println(firstDuplicateOptimized(new int[]{2, 4, 3, 5, 1}));
    }

    //O(n) time and O(n) space
    public static int firstDuplicate(int arr[]){
        HashMap<Integer,Integer> lookUpMap = new HashMap<>();//Can use a hashset as well since we dont need the index
        for(int i=0;i<arr.length;i++){
            if(lookUpMap.get(arr[i])!=null)
                return arr[i];
            lookUpMap.put(arr[i],i);
        }
        return -1;
    }

    //This needs to take Advantage of the arrays having values from 1 to n-1
    // so what we do? We treat each value we find as an index.
    // how is that gonna help?
    // So think now, if we treat each value as index (ie. value-1)
    // and update it to something say -1 times the element (which we know cannot be present in this array)
    // now we can just add a check to see if that index has been already updated to -1 and voila!! we have found the first duplicate
    public static int firstDuplicateOptimized(int arr[]){
        for(int i=0;i<arr.length;i++){
            if(arr[Math.abs(arr[i])-1]<0)
                return Math.abs(arr[i]);
            arr[Math.abs(arr[i])-1]=-arr[Math.abs(arr[i])-1];
        }
    return -1;
    }
}
