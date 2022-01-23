package com.sanu.ds.linkedlist;

public class MergeSortedList {

    public static void main(String[] args) {
        ListNode iter1 = ListOperations.createSimpleLinkedListWithNElements(6);
        ListNode iter2 = ListOperations.createSimpleLinkedListWithNElements(5);
        ListOperations.printALinkedList(iter1);
        ListOperations.printALinkedList(iter2);
        ListNode iter3 = mergeSortedLinkedLists(iter1,iter2);
        ListOperations.printALinkedList(iter3);

    }

    public static ListNode mergeSortedLinkedLists(ListNode node1, ListNode node2) {
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
