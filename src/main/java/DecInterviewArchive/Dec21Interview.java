package DecInterviewArchive;

import com.sanu.ds.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Dec21Interview {

    /**
     *
     *  LinkedList l1= head->1->2->3->null
     *
     *  Circular l2 = head ->1->2->3->4->2
     *
     * Push zeros to end:
     * Input :  [1, 2, 0, 4, 3, 0, 5, 0]
     * Output : [1, 2, 4, 3, 5, 0, 0, 0]
     *
     *
     *
     *
     *
     *
     * @param args
     */

    public static void main(String[] args) {


    }

    public static boolean findIfCircularLinkedList(ListNode head){

        ListNode headFast = head;
        ListNode headSlow = head;
        while(headFast!=null && headSlow!=null){

            if(headSlow==headFast)
                return true;

            headFast=headFast.getNext().getNext();
            headSlow=headSlow.getNext();

        }


        return false;
    }


    public static int[] pushZerosToTheBack(int arr[]){
        int counter=0;
        int outputArr[] = new int[arr.length];

        for(int index=0;index<arr.length;index++){
            if(arr[index]!=0){
                outputArr[counter++]=arr[index];
            }
        }
        for(int index = counter;counter<arr.length;index++){
            arr[index]=0;
        }
        return outputArr;
    }
}
