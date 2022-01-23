package JanInterViewArchive1;

import java.util.HashSet;

public class Jan5thInterview {


    public static void main(String[] args) {

        System.out.println(happyNumber(24));

    }
//    Subsets:
//    Input: [1, 3,5]
//    Output: [], [1], [3], [1,3] 3,5


    /**
     *
     * [1,3,5,7,9]
     *
     * 1,3   1,3,5  1,3,5,7    1,3,5,7,9
     * 3,5   3,5,7  3,5,7,9
     *
     * 1,7,9
     */
//    public static void findAllSubsets(int arr[]){
//
//        System.out.println(new int[]{});
//        if(arr.length==1){
//            System.out.println(arr[0]);
//            return;
//        }
//
//        for(int outerIndex=0;outerIndex<arr.length;outerIndex++){
//            System.out.println(arr[outerIndex]);
//        }
//
//        int firstPointer=0;
//        int secondPointer=firstPointer+1;
//
//        while(firstPointer!=secondPointer){
//            printAllElementsFromFirstToSecond(arr,firstPointer,secondPointer);
//            fir
//        }
//
//    }
//
//    private static void printAllElementsFromFirstToSecond(int[] arr, int firstPointer, int secondPointer) {
//        for(int i=)
//    }

    /**
     *  Input: 23
     * Output: true (23 is a happy number)
     * 4 + 9 = 13
     * 1 + 9 = 10
     * 1 + 0 = 1
     *
     * 133
     * 1+9+9= 19
     *  1+81= 82
     *  64+4=68
     *  36+64=100
     *
     *  132
     *
     *  1+9+4 = 14
     *  1+16=17
     *  1+49=50
     *  25+0=25
     *  29
     *  85
     *  89
     *  64+81=145
     *  42
     *  20
     *  4
     *  16
     *  37
     *  58
     *  89
     *
     *
     *
     */
    public static boolean happyNumber(int nums){

        if(nums==1)
            return true;

        if(nums==4)
            return false;


            int sum = 0;
            while (nums > 0) {
                int digit = nums % 10;
                sum += digit * digit;
                nums /= 10;
            }
            return happyNumber(sum);

    }
}
