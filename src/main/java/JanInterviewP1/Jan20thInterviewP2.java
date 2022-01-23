package JanInterviewP1;

import java.util.Arrays;

public class Jan20thInterviewP2 {

    public static void main(String[] args) {
       System.out.println(Arrays.toString(shiftZerosToStart(new int[]{0,4,5,3,0,0,2,7})));
    }

    /**
     * Given an array [0,4,5,3,0,0,2,7], in place - all 0’s in the start =>3
     * index = l-1
     * int counter = 0;
     * for(i->l-1-0){         [4,0,5,4,5,3,2,7]
     *     if(nums[i]!=0){
     *        nums[index] = nums[i]
     *        index--;
     *        } else {
     *            counter++
     *        }
     * }
     *
     * for(i 0->counter)
     * nums[i]=0;
     *
     *                [0,0,0,4,5,3,2,7]
     *
     *                [1,0,2,0,3]
     *                [0,1,2,3]
     */

    public static int[] shiftZerosToStart(int nums[]){

        int index = nums.length-1;
        int counter= 0;

        for(int i=nums.length-1; i>=0;i--){

            if(nums[i]!=0){
                nums[index]=nums[i];
                index--;
            }else{
                counter++;
            }
        }

        for(int i=0;i<counter;i++)
            nums[i]=0;

        return nums;

    }
}
