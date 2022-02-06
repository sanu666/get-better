package JanInterviewP1;

import com.sanu.ds.linkedlist.ListNode;

public class Jan26thInterview {

    public static void main(String[] args) {

    }

    /**
     * 1-> 2-> 3-> 4-> 15-> 17->18
     * Find nth node from the end of the linked list
     * i/p: 1  o/p: 18
     *
     * length = 7;
     * n = 2
     *
     * position = length-n+1 = 5
     *
     * Time Complexity = O(n)
     * Space  Complexity = O(1)
     *
     *
     *
     *
     */

    public static int findNthNodeFromTail(ListNode head, int n){
        ListNode current = head;

        ListNode fast = head;
        ListNode slow = head;
        int slowCounter = 0;
        int currentStartCounter = 0;

        while(fast.next!=null){
            slow = slow.next;
            slowCounter++;
            fast = fast.next.next;
        }

        if(slowCounter>n){
            while (slowCounter!=n){
                slow=slow.next;
                slowCounter++;
            }
        } else{
            while (currentStartCounter!=n-slowCounter){
                current=current.next;
                slowCounter++;
            }

        }
        return slow.data;



    }


}
