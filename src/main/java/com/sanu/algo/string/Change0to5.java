package com.sanu.algo.string;

public class Change0to5 {
    public static void main(String[] args) {
        /**
         * Input: 102
         * Output: 152
         * Explanation: All the digits which are '0' is replaced by '5'
         *
         * Input: 1020
         * Output: 1525
         *
         * or input = 1020, output = 1525,
         * which can be written as 1020 + 505,
         * which can be further written as 1020 + 5*(10^2) + 5*(10^0).
         *
         *
         */
        System.out.println(changeZeroToFive(-1020));
    }

    public static int changeZeroToFive(int num){


        int result=0;
        int decimalPlace=1;
        boolean isNegative=false;

        if(num<0){
            isNegative=true;
            num*=-1;
        }
        int copyNum=num;

        if(num==0)
            return 5;

        while(num>0){
            if(num%10==0){
                result+=decimalPlace*5;
            }
            num/=10;
            decimalPlace*=10;

        }

        return isNegative?-1*(result+copyNum):(result+copyNum);

    }
}
