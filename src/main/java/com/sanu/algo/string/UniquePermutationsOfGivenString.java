package com.sanu.algo.string;

public class UniquePermutationsOfGivenString {

    public static void main(String[] args) {
        uniquePermutation("abcdef");

    }


    public static void uniquePermutation(String str){

        printUniquePermutations(str,0,str.length());
    }

    public static void printUniquePermutations(String str, int start, int end){
        if(start==end-1)
            System.out.println(str);
        else{
            for(int index=start; index<end;index++){
                str=swap(str,start,index);
                printUniquePermutations(str,start+1,end);
                str=swap(str,start,index);

            }
        }
    }

    public static String swap(String str,int i, int j){

        char[] charArr = str.toCharArray();
        char temp;

        temp=charArr[i];
        charArr[i]=charArr[j];
        charArr[j]=temp;
        return String.valueOf(charArr);

    }

    public static void practice(String str,int start,int end){
        if(start==end-1)
            System.out.println(str);
        else {
            for (int i = start; i < end; i++) {
                str = swap(str, start, i);
                practice(str, start + 1, end);
                str = swap(str, start, i);
            }
        }
    }
}
