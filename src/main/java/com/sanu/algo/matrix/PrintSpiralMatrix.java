package com.sanu.algo.matrix;

import java.util.ArrayList;
import java.util.List;

public class PrintSpiralMatrix {

    public static void main(String[] args) {

    }

    /**
     Given an m x n matrix, return all elements of the matrix in spiral order.



     Example 1:


     Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
     Output: [1,2,3,6,9,8,7,4,5]
     Example 2:


     Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
     Output: [1,2,3,4,8,12,11,10,9,5,6,7]

     https://leetcode.com/problems/spiral-matrix/
     https://www.youtube.com/watch?v=3joo9yAZVh8
     */

    public static List<Integer> printSpiralMatrix(int nums[][]){

        List<Integer> outputSpiral = new ArrayList<>();
        if(nums.length==0) return outputSpiral;

        int rowBegin=0;
        int rowEnd = nums.length-1;
        int columnBegin = 0;
        int columnEnd = nums[0].length-1;

        while (rowBegin<=rowEnd && columnBegin<=columnEnd){


            for(int i=columnBegin;i<=columnEnd;i++)
                outputSpiral.add(nums[rowBegin][i]);
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++){
                outputSpiral.add(nums[i][columnEnd]);
            }
            columnEnd--;


            if(rowBegin<=rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    outputSpiral.add(nums[rowEnd][i]);
                }
            }
            rowEnd--;


            if(columnBegin<=columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    outputSpiral.add(nums[i][columnBegin]);
                }
            }
            columnBegin++;

        }
        return outputSpiral;

    }
}
