package com.sanu.ds.linkedlist;

public class ListOperations {

    public static void main(String[] args) {

        ListNode iter = createSimpleLinkedListWithNElements(5);
        printALinkedList(iter);
//        ListNode iter1 = addSingleElementToALinkedListEnd(iter,99);
     //   printALinkedList(iter1);

//        ListNode iter2 = addElementToSpecificPos(iter,25,6);
//        printALinkedList(iter2);

//        ListNode iter3 = reverseALinkedListIterative(iter);
//        printALinkedList(iter3);
//        printLinkedListInReverse(iter);

        ListNode iter4 = reverseLinkedListRecursion(iter);
        printALinkedList(iter4);


    }

    public static void printALinkedList(ListNode iter){
        System.out.println();
        while (iter!=null) {
            System.out.print(" "+iter.getData());
            iter=iter.getNext();
        }
    }

    public static ListNode createSimpleLinkedListWithNElements(int n){
        ListNode head = null;
        ListNode prev = null;

        for(int index=0;index<n;index++){
            ListNode node =  new ListNode(index);
            if(head==null)
                head=(node);
        else {
                prev.setNext(node);
            }
                prev = node;
        }
        return head;

    }

    public static ListNode addSingleElementToALinkedListEnd(ListNode head, int numb){
        ListNode copyHead = head;

        if(head==null){
            ListNode node = new ListNode(numb);
            head = node;
            return head;
        }
        while(head.getNext()!=null){
            head=(head.getNext());
        }
        ListNode node=new ListNode(numb);
        head.setNext(node);
        return copyHead;
    }

    public static ListNode addElementToSpecificPos(ListNode head, int numb, int pos){
        ListNode copyHead = head;
        if((head==null && pos>1) || (pos<1) ){
            throw new UnsupportedOperationException("Position Out Of Bounds");
        }
        if(pos==1){
            ListNode node =  new ListNode(numb);
            ListNode temp = head;
            head = node;
            node.setNext(temp);
            return head;
        }
        int counter = 0;
        while(head.getNext()!=null){
            counter++;
            if(counter==pos-1){
                ListNode node = new ListNode(numb);
                node.setNext(head.getNext());
                head.setNext(node);

            }
            head=head.getNext();
        }

        if(counter==pos-2) {
            ListNode node = new ListNode(numb);
            node.setNext(null);
            head.setNext(node);
            return copyHead;
        }
        throw new UnsupportedOperationException("Index Out Of Bounds");


    }

    public static ListNode reverseALinkedListIterative(ListNode head){
        ListNode prev= null;
        ListNode current=head;
        ListNode next;

        while(current!=null){
            next = current.getNext();
            current.setNext(prev);
            prev=current;
            current=next;
        }

        return prev;

    }

    public static void printLinkedListInReverse(ListNode head){
        if(head==null)
            return;
        printLinkedListInReverse(head.getNext());
        System.out.print("\n"+head.getData());
    }

    public static ListNode reverseLinkedListRecursion(ListNode head){
        if(head.getNext()==null || head==null){
            return head;
        }
        ListNode temp=reverseLinkedListRecursion(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return temp;
    }
}
