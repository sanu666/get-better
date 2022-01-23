package com.sanu.ds.linkedlist;

public class GetNodeValueFromTail {

    public static void main(String[] args) {
        ListNode node1a = new ListNode(3);
        ListNode node1b = new ListNode(2);
        ListNode node1c = new ListNode(1);
        ListNode node1d = new ListNode(0);

        node1a.setNext(node1b);
        node1b.setNext(node1c);
        node1c.setNext(node1d);

        System.out.println(getNodeValue(node1a,2));

    }

    /**
     *
     * Given a pointer to the head of a linked list and a specific position,
     * determine the data value at that position. Count backwards from the tail node.
     * The tail is at postion 0, its parent is at 1 and so on.
     *
     *Example
     * head refers to  3 -> 2 -> 1 -> 0 -> NULL
     * positionFromTail = 3
     *
     * o/p: 2
     *
     * Each of the data values matches its distance from the tail.
     * The value  is at the desired position.
     *
     * Function Description
     *
     * So basically here I am getting the size of the linked List and computing the position from head
     * and in the second loop I am just iterating it checking with a counter
     */
    public static int getNodeValue(ListNode head, int positionFromTail){
        int length = 0;
        ListNode dummyHead = head;
        while (dummyHead!=null){
            length++;
            dummyHead=dummyHead.next;
        }
        int positionFromHead = length-positionFromTail;
        int counter=-1;
        while (head!=null){
            counter++;
            if(counter==positionFromHead)
                return head.data;
            head=head.next;
        }
        return -1;

    }

    public static int getNodeValueOptimised(ListNode head, int positionFromTail){
        ListNode dummyHead = head;
        int counter=0;

        while (head!=null){
            head=head.next;
            if(counter<positionFromTail){
                counter++;
            }else {
                dummyHead=dummyHead.next;
            }
        }

        return dummyHead.data;
    }
}
