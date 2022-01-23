package com.sanu.ds.linkedlist;

import java.util.Stack;

public class PrintInReverse {

    public static void main(String[] args) {

    }

    public static void reversePrintLinkedList(ListNode head){
        if(head==null)
            return;

        Stack<Integer> listElements = new Stack<>();
        while (head!=null){
            listElements.push(head.data);
            head=head.next;
        }
        while (!listElements.isEmpty())
            System.out.print(listElements.pop());
    }

    public static void reversePrintLinkedListRecursion(ListNode head){
        if(head==null)
            return;
        reversePrintLinkedListRecursion(head.next);
        System.out.println(head.data);

    }
}
