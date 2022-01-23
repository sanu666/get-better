package com.sanu.algo.string;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {

        System.out.println(longestSubString("Hello"));

    }

    public static int longestSubString(String str){
        char[] charArr = str.toCharArray();
        Set<Character> characterSet = new HashSet<>();

        int firstPointer=0;
        int secondPointer=0;
        int max = 0;

        while (secondPointer<charArr.length){
            if(!characterSet.contains(charArr[secondPointer])){
                characterSet.add(charArr[secondPointer]);
                secondPointer++;
                max = Math.max(characterSet.size(),max);
            }else{
                characterSet.remove(charArr[firstPointer]);
                firstPointer++;
            }
        }
        return max;


    }
}
