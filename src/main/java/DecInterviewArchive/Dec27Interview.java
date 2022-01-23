package DecInterviewArchive;

public class Dec27Interview {

    //print all unique permutations of a given String?

    //Input: abc
//Output: abc, bac, cab, acb, bca, cba
    public static void main(String[] args) {

        permutationHandler("abc");

    }

    public static void permutationHandler(String input){

        if(input.length()>=3){
           for(int i=0;i<input.length()-1;i++){
//               if(i+3>input.length())
//               String str = input.substring(i,i+3);
//               permutation(str);
           }
        }
    }

    public static void permutationRecursive(String input){

//        if(input)//



        for(int index=0;index<input.length();index++){
            String firstElement = String.valueOf(input.charAt(index));
//            String output =
        }


    }

    public static void permutation(String input) {
        char[] inputCharArray = input.toCharArray();
        String temp="";

        for(int i=0;i<inputCharArray.length;i++){
            temp= String.valueOf(inputCharArray[i]);
            for(int j=0;j<inputCharArray.length; j++){
                if(j!=i)
                    temp+=inputCharArray[j];
            }
            System.out.println(temp);
            temp= String.valueOf(inputCharArray[i]);
            for(int j=inputCharArray.length-1;j>-1; j--){
                if(j!=i)
                    temp+=inputCharArray[j];
            }
            System.out.println(temp);
        }
    }
}
