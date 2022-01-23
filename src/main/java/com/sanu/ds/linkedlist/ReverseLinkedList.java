package com.sanu.ds.linkedlist;

public class ReverseLinkedList {

    public static ListNode reverseLinkedList(ListNode head){
        //https://www.youtube.com/watch?v=NhapasNIKuQ&t=195s
        ListNode prev =null;

        while(head!=null){
            ListNode next = head.next;
            head.next=prev;
            prev=head;

            head=next;
        }
        return prev;
    }

    // Complete the reverse function below.
    static ListNode reverseRecursively(ListNode head) {
        if(head == null) {
            return head;
        }

        // last node or only one node
        if(head.next == null) {
            return head;
        }

        ListNode newHeadNode = reverseRecursively(head.next);

        // change references for middle chain
        head.next.next = head;
        head.next = null;

        // send back new head node in every recursion
        return newHeadNode;
    }
}
