package com.sanu.ds.linkedlist;

public class InsertNodeAtTheTail {

    public static void main(String[] args) {

    }

    public static ListNode insertAtTail(ListNode head,int val){
        if(head==null){
            return new ListNode(val);
        }
        ListNode temp = head;
        while (head!=null && head.next!=null)
            head=head.next;

        ListNode node = new ListNode(val);
        head.next=node;
        return temp;
    }
}
