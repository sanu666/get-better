package JanInterviewP1;

import java.util.HashMap;

public class Jan12thInterviewP1 {

    public static void main(String[] args) {

        System.out.print(checkAnagram("aaaaa","aabb"));

    }

    public static int checkAnagram(String str1, String str2){

//        if(str1.length()!=str2.length())
//            return -1;
        char[] chArr1 = null;
        char[] charArr2 = null;
        if(str1.length()>str2.length()) {
             chArr1 = str1.toCharArray();
             charArr2 = str2.toCharArray();
        } else{
             chArr1 = str2.toCharArray();
             charArr2 = str1.toCharArray();
        }
        HashMap<Character,Integer> lookUpMap = new HashMap<>();

        for(int index=0;index<chArr1.length;index++){

            if(lookUpMap.get(chArr1[index])!=null){
                lookUpMap.put(chArr1[index],lookUpMap.get(chArr1[index])+1);
            }else {
                lookUpMap.put(chArr1[index], 1);
            }
        }
        for(int index=0;index<charArr2.length;index++){

            if(lookUpMap.get(charArr2[index])!=null){
                lookUpMap.put(charArr2[index],lookUpMap.get(charArr2[index])-1);
            }else {
                lookUpMap.put(charArr2[index], -1);
            }
        }

        int counter=0;
        for(Integer x: lookUpMap.values()){
            if(x!=0)
                counter+=Math.abs(x);
        }
        return counter;






    }
}
