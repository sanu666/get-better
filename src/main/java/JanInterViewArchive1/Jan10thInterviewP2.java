package JanInterViewArchive1;

import java.util.Arrays;
import java.util.HashMap;

public class Jan10thInterviewP2 {

    public static void main(String[] args) {
        System.out.print(Arrays.toString(getCurrencyDenomination((new int[]{3,7,9,2}),6)));
    }

    /**
     *
     * Programming Question:
     * Given a list of currency denominations, find whether you can buy a product or not.
     * Assume that the shopkeeper has no change, so they expect the exact amount.
     * If the product can be purchased, then return the indices of the denominations
     * using which this can be achieved. Only two currencies can be used.
     *
     *
     * Assume that each input has exactly one solution.
     * Same element cannot be used twice.
     * Return the answer in any order.
     *
     *  Example 1:
     *
     *  Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     *
     *  Example 2:
     *
     *  Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     *  Example 3:
     *
     *  Input: nums = [3,3], target = 6
     * Output: [0,1]
     *
     *  Example 4:
     *
     *  Input: nums = [3,7,9,2], target = 6
     * Output: [-1,-1]
     */

     /**
     *
     */

     public static int[] getCurrencyDenomination(int arr[],int target){
         HashMap<Integer,Integer> lookUp= new HashMap<>();
         for(int index=0;index<arr.length;index++){
             int complement = target-arr[index];
             if(complement>0) {
                 if (lookUp.get(complement)!=null){
                     return  new int[]{lookUp.get(complement),index};
                 }

             }
             lookUp.put(arr[index],index);
         }

         return new int[]{-1,-1};

     }

}
