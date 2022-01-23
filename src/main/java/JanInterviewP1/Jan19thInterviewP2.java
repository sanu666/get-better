package JanInterviewP1;

import com.sanu.ds.linkedlist.AddTwoNumbersLinkedListBothSolutions;
import com.sanu.ds.linkedlist.ListNode;

public class Jan19thInterviewP2 {

    public static void main(String[] args) {

        ListNode node1a = new ListNode(1);
        ListNode node1b = new ListNode(2);
        ListNode node1c = new ListNode(3);

        node1a.setNext(node1b);
        node1b.setNext(node1c);

        ListNode node2a = new ListNode(4);
        ListNode node2b = new ListNode(9);
        node2a.setNext(node2b);
        printLinkedlLIst(node1a);
        printLinkedlLIst(node2a);
        ListNode output = AddTwoNumbersLinkedListBothSolutions.addTwoNumbersLinkedListProperRepresentation(node1a, node2a);

        printLinkedlLIst(output);

    }

    /**
     * 1 -> 2 -> 3 = 123
     * 4 -> 9  = 49
     *                  1,2,3 = > 123
     *                  4,9  => 49
     *                  sum = 172 => String
     *
     *                  outputLinkedList = 1->7->2
     *
     * ——————
     * 5 -> 8 -> 4
     */

    public static void printLinkedlLIst(ListNode  head){
        while (head!=null){
            if(head.getNext()!=null)
                System.out.print(head.getData()+"->");
            else
                System.out.print(head.getData());
            head=head.getNext();
        }
        System.out.println();
    }


    public static ListNode sumTwoLinkedList(ListNode h1, ListNode h2){

        if(h1==null && h2==null)
            return null;

        if(h1==null || h2==null){
            return h1==null?h2:h1;
        }


        String firstNumb = "";
        String secondNumb = "";
        while (h1!=null){
            firstNumb+=h1.getData();
            h1=h1.getNext();
        }
        while (h2!=null){
            secondNumb+=h2.getData();
            h2=h2.getNext();
        }

        int sum = Integer.parseInt(firstNumb)+Integer.parseInt(secondNumb);
        String sumString = String.valueOf(sum);

        ListNode head = new ListNode(0);
        ListNode dummyHead = new ListNode(0);
        dummyHead=head;
        int i=0;
        while(i<sumString.length()){
            int digit = Integer.parseInt(String.valueOf(sumString.charAt(i)));
            ListNode node = new ListNode(digit);
            head.setNext(node);
            head = head.getNext();
            i++;
        }

        return dummyHead.getNext();



    }
}
