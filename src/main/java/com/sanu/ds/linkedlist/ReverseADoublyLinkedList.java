package com.sanu.ds.linkedlist;

public class ReverseADoublyLinkedList {

    public static void main(String[] args) {

    }

    public static DoubleListNode reverse(DoubleListNode head) {
        DoubleListNode current = head;
        // Write your code here
        while (current!=null){
            DoubleListNode next = current.next;
            current.next = current.prev;
            current.prev = next;
            current=current.next;
        }

        return current;

    }
}
