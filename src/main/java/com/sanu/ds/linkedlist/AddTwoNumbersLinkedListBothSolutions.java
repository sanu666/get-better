package com.sanu.ds.linkedlist;

import java.util.Stack;

public class AddTwoNumbersLinkedListBothSolutions {

    public static void main(String[] args) {

    }

    /**
     * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [7,0,8]
     * Explanation: 342 + 465 = 807.
     * Example 2:
     *
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     * Example 3:
     *
     * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
     * Output: [8,9,9,9,0,0,0,1]
     */

    public static ListNode addTwoNumbersLinkedListReverseRepresentation(ListNode l1,ListNode l2){
        ListNode dummy_head = new ListNode(0);
        ListNode temp = dummy_head;

        int carry = 0;
        while(l1!=null || l2!=null){
            int data1 = l1==null?0:l1.data;
            int data2 = l2==null?0:l2.data;

            int sum = data1+data2+carry;
            carry = sum/10;
            int lastDigit = sum%10;

            ListNode node = new ListNode(lastDigit);
            temp.next = node;

            l1=l1==null?l1:l1.next;
            l2=l2==null?l2:l2.next;
            temp=temp.next;

        }
        if(carry>0){
            ListNode node = new ListNode(1);
            temp.next = node;
            temp = temp.next;
        }

        return dummy_head.next;
    }

    /**
     * You are given two non-empty linked lists representing two non-negative integers. The most significant digit comes first and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
     *
     * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: l1 = [7,2,4,3], l2 = [5,6,4]
     * Output: [7,8,0,7]
     * Example 2:
     *
     * Input: l1 = [2,4,3], l2 = [5,6,4]
     * Output: [8,0,7]
     * Example 3:
     *
     * Input: l1 = [0], l2 = [0]
     * Output: [0]
     */
    public static ListNode addTwoNumbersLinkedListProperRepresentation(ListNode l1,ListNode l2){
        ListNode reverseL1 = reverseLinkedList(l1);

        ListNode reverseL2 = reverseLinkedList(l2);
        return reverseLinkedList(addTwoNumbersLinkedListReverseRepresentation(reverseL1,reverseL2));


    }

    /**
     * Using Stack
     */

    public static ListNode addLinkedListForward(ListNode l1,ListNode l2){
        Stack<Integer> stack1 = addLinkedListElementsToStack(l1);
        Stack<Integer> stack2 = addLinkedListElementsToStack(l2);
        ListNode head = null;

        int carry = 0;
        while(!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
            int sum=carry;
            if(!stack1.isEmpty())
                sum+=stack1.pop();
            if(!stack2.isEmpty())
                sum+=stack2.pop();

            ListNode node = new ListNode(sum%10);
            node.next=head;
            head=node;
            carry = sum/10;
        }

        return head;


    }

    public static Stack<Integer> addLinkedListElementsToStack(ListNode node){
        Stack<Integer> stackNode = new Stack<>();
        while (node!=null){
            stackNode.push(node.data);
            node=node.next;
        }
        return stackNode;
    }

    public static ListNode reverseLinkedList(ListNode head){
        ListNode prev = null;
        ListNode temp = head;

        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;

            prev = temp;
            temp=next;
        }
        return prev;
    }
}
