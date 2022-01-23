package JanInterViewArchive1;

public class Jan10thInterview {

    public static void main(String[] args) {

        System.out.println(reverseSentence("this is ab."));

    }

    /**
     * Write a java program to reverse each word in string?
     *
     * this is ab.
     * siht si ba.
     */

    //


    public static String reverseSentence(String sentence){
        String output = "";
        int pointerFirstElementWord = 0;

        for(int index=0;index<sentence.length();index++){
            if(sentence.charAt(index)==' '||sentence.charAt(index)=='.'){
                output+=" "+reverseString(sentence.substring(pointerFirstElementWord,index).toCharArray());
                pointerFirstElementWord = index+1;
            }
        }

        return output;




    }
    public static String reverseString(char[] charArr){

        if(charArr.length==1)
            return String.valueOf(charArr);
        int low=0;
        int high = charArr.length-1;
        while(low<=high){
            char temp = charArr[low];
            charArr[low]=charArr[high];
            charArr[high]=temp;
            low++;
            high--;
        }

        return String.valueOf(charArr);

    }
}
