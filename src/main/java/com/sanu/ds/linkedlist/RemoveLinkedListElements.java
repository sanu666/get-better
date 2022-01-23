package com.sanu.ds.linkedlist;

public class RemoveLinkedListElements {
    public static void main(String[] args) {

    }

    /**
     * Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: head = [1,2,6,3,4,5,6], val = 6
     * Output: [1,2,3,4,5]
     * Example 2:
     *
     * Input: head = [], val = 1
     * Output: []
     * Example 3:
     *
     * Input: head = [7,7,7,7], val = 7
     * Output: []
     */
    public static ListNode removeLinkedListElements(ListNode head,int target){

        while (head!=null && head.data==target){
            head=head.next;
        }

        ListNode temp = head;

        while(temp!=null && temp.next!=null){
            if(temp.next.data==target){
                temp.next=temp.next.next;
            } else {
                temp=temp.next;
            }
        }
        return head;


    }
}
