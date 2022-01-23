package com.sanu.ds.linkedlist;

public class PalindromeLinkedList {

    public static void main(String[] args) {

    }

    /**
     * iven the head of a singly linked list, return true if it is a palindrome.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: head = [1,2,2,1]
     * Output: true
     * Example 2:
     *
     *
     * Input: head = [1,2]
     * Output: false
     *
     * Solution:-
     * 1. use two pointer, slow and fast, and reach till the end
     * 2. the slow pointer will be in the middle.
     * 3. reverse the LL from slowPointer(middle till the end)
     * 4. Initialize the left and right pointers as head and prev
     * 5. use normal logic to check if they are palindrome
     */
    public static boolean isPalindrome(ListNode head){

        ListNode fastPointer = head;
        ListNode sloPointer = head;

        while(fastPointer!=null && fastPointer.next!=null){
            fastPointer=fastPointer.next.next;
            sloPointer=sloPointer.next;
        }

        ListNode prev = null;
        ListNode temp =sloPointer;
        while(temp!=null){
            ListNode next = temp.next;
            temp.next = prev;

            prev = temp;
            temp=next;
        }

        ListNode left = head;
        ListNode right = prev;

        while (right!=null){
            if(left.data!=right.data)
                return false;
            left=left.next;
            right=right.next;
        }
        return true;

    }
}
