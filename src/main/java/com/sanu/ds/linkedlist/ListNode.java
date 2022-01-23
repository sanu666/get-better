package com.sanu.ds.linkedlist;

public class ListNode {

     public int data;
     public ListNode next;

    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }

    public int getData() {
        return data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }
}
