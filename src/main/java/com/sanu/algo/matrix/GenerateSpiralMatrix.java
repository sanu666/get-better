package com.sanu.algo.matrix;

import java.util.Arrays;

public class GenerateSpiralMatrix {

    public static void main(String[] args) {
//        System.out.println(Arrays.toString(generateMatrix(3)));
    }

    public static int[][] generateMatrix(int n){

        int[][] outPutMatrix = new int[n][n];
        int countNum = 1;
        int rowBegin = 0;
        int rowEnd = n-1;
        int columnBegin = 0;
        int columnEnd = n-1;

        while (rowBegin<=rowEnd && columnBegin<=columnEnd && countNum<=(n*n)){

            for(int i=columnBegin;i<=columnEnd;i++){
                outPutMatrix[rowBegin][i]=countNum++;
            }
            rowBegin++;

            for(int i=rowBegin;i<=rowEnd;i++){
                outPutMatrix[i][columnEnd]=countNum++;
            }
            columnEnd--;

            if(rowBegin<=rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    outPutMatrix[rowEnd][i] = countNum++;
                }
            }
            rowEnd--;
            if(columnBegin<=columnEnd){
                for(int i=rowEnd;i>=rowBegin;i--){
                    outPutMatrix[i][columnBegin]=countNum++;
                }
            }
            columnBegin++;
        }
        return outPutMatrix;

    }
}
