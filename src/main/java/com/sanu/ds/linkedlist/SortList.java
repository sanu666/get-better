package com.sanu.ds.linkedlist;

public class SortList {

    public static ListNode sortList(ListNode head){
        if(head==null || head.next==null){
            return head;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;
        ListNode temp = head;

        while (fastPointer!=null && fastPointer.next!=null){
            temp=slowPointer;
            slowPointer=slowPointer.next;
            fastPointer=fastPointer.next.next;
        }

        temp.next=null;
        ListNode leftSide = sortList(head);
        ListNode rightSide = sortList(slowPointer);
        return merge(leftSide,rightSide);

    }

    private static ListNode merge(ListNode node1, ListNode node2) {
        ListNode tempNode = new ListNode(0);
        ListNode current = tempNode;

        while (node1 != null && node2 != null) {
            if (node1.getData() < node2.getData()) {
                current.setNext(node1);
                node1 = node1.getNext();
            } else {
                current.setNext(node2);
                node2 = node2.getNext();
            }
            current=current.getNext();
        }

        if (node1 != null) {
            current.setNext(node1);
        }

        if (node2 != null) {
            current.setNext(node2);
        }

        return tempNode.getNext();
    }
}
