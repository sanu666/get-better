package com.sanu.ds.linkedlist;

public class IntersectionOfTwoLinkedList {

    //Problem statement : https://dev.to/seanpgallivan/solution-intersection-of-two-linked-lists-478e


    public static ListNode getInterSectionOfTwoLinkedList(ListNode node1,ListNode node2){

        if(node1==null || node2==null)
            return null;

        ListNode firstPointer = node1;
        ListNode secondPointer = node2;

        while(firstPointer!=secondPointer){
            if(firstPointer==null){
                firstPointer=node2;
            }
            else{
                firstPointer=firstPointer.next;
            }
            if(secondPointer==null){
                secondPointer=node1;
            }
            else{
                secondPointer=secondPointer.next;
            }

        }

        return firstPointer;



    }
}
