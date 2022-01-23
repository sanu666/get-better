package com.sanu.ds.linkedlist;

public class FindMergePointOfTwoLinkedLists {
    public static void main(String[] args) {

    }

    /**
     * Given pointers to the head nodes of  linked lists that merge together at some point, find the node where the two lists merge. The merge point is where both lists point to the same node, i.e. they reference the same memory location. It is guaranteed that the two head nodes will be different, and neither will be NULL. If the lists share a common node, return that node's  value.
     *
     * Note: After the merge point, both lists will share the same node pointers.
     *
     * Example
     *
     * In the diagram below, the two lists converge at Node x:
     *
     * [List #1] a--->b--->c
     *                      \
     *                       x--->y--->z--->NULL
     *                      /
     *      [List #2] p--->q
     */
    public static ListNode findMergePoint(ListNode head1, ListNode head2){

        ListNode head1Current = head1;
        ListNode head2Current = head2;

        while (head1Current!=head2Current){
            if(head1Current.next==null){
                head1Current = head2;
            } else {
                head1Current=head1Current.next;
            }
            if(head2Current.next==null){
                head2Current = head1;
            } else {
                head2Current=head2Current.next;
            }
        }
        return head1Current;

    }
}
