package com.sanu.ds.linkedlist;

public class ConvertBinaryNumberToLinkedList {

    public static void main(String[] args) {

    }

    /**
     * Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
     *
     * Return the decimal value of the number in the linked list.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: head = [1,0,1]
     * Output: 5
     * Explanation: (101) in base 2 = (5) in base 10
     */

    public static int getDecimalValue(ListNode head) {
      int length = 0;
      ListNode temp = head;
      while (temp!=null){
          length++;
          temp=temp.next;
      }
      int result = 0;
      length--;
      while (head!=null){
          result +=head.data*((int)Math.pow(2,length));
          length--;
          head=head.next;
      }
      return result;

    }
}
