package com.sanu.ds.linkedlist;

public class RemoveDuplicateFromLinkedList {

    public static void main(String[] args) {

    }

    /**
     * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: head = [1,1,2]
     * Output: [1,2]
     * Example 2:
     *
     *
     * Input: head = [1,1,2,3,3]
     * Output: [1,2,3]
     */

    public static ListNode removeDuplicatesFromSortedLinkedList(ListNode head){
        ListNode temp=head;
        while(temp!=null && temp.next!=null){
            if(temp.data==temp.next.data)
                temp.next=temp.next.next;
            else  temp=temp.next;
        }
        return head;
    }
}
