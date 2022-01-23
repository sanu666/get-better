package com.sanu.ds.linkedlist;

public class IdenticalLinkedList {

   public static boolean compareLists(ListNode head1, ListNode head2) {

       while (head1!=null || head2!=null){
           if((head1.next==null && head2.next !=null)||(head1.next!=null && head2.next==null)){
               return false;
           }
           if(head1.data!=head2.data)
               return false;
           head1=head1.next;
           head2=head2.next;
       }
       return true;


    }
}
