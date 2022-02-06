package FebInterview;

import com.sanu.ds.linkedlist.ListNode;

import java.util.Arrays;
import java.util.List;

public class Feb5thInterview {

    public static void main(String[] args) {

//        permutation("1234");
        System.out.println(Arrays.toString(shiftZerosToTheEnd(new int[]{0,1,2,0,3,4,0,5})));
        
    }

    // 1->2->3
    public static ListNode reverseLinked(ListNode head){
        ListNode prev = null;

        while (head!=null){



            ListNode next  = head.next;//swap prev and head.next,  swap head and prev
            head = prev;

            prev = head;
            head=next;

        }
         return prev;
    }

    //print all the permutations of a string
    //hello-> ehllo,...

    public static void permutation(String str){

//        for (int i=0;i<str.length();i++){
            permutationRunner(str,0,str.length()-1);
//        }
    }

    public static void permutationRunner(String str,int start, int end){
        if(start==end){
            System.out.println(str);
        }
        for(int i=start;i<=end;i++){
            str=swap(str,start,i);
            permutationRunner(str,start+1,end);
            str=swap(str,start,i);
        }
    }

    public static String swap(String str,int start, int end){
        char[] chArr = str.toCharArray();
        char temp = chArr[start];
        chArr[start] = chArr[end];
        chArr[end] = temp;

        return String.valueOf(chArr);
    }

//    1,2,3,0,8,0,9,0
//    1,2,3,8,9,0,0,0

    //,12,0

    public static int[] shiftZerosToTheEnd(int nums[]){
        int indexNonZero = 0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[indexNonZero]=nums[i];
                indexNonZero++;
            }
        }

        for(int i = indexNonZero;i<nums.length;i++)
            nums[i]=0;

        return nums;

    }



}
