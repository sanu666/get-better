package com.sanu.ds.linkedlist;

public class InsertANodeAtTheHead {
    public static void main(String[] args) {

    }

    public static ListNode insertNodeAtTheHeadOfLinkedList(ListNode head, int target){
        ListNode node = new ListNode(target);
        if(head==null){
            return node;
        }
        node.next=head;
        return node;

    }
}
