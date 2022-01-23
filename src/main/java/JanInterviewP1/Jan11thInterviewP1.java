package JanInterviewP1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Jan11thInterviewP1 {

    public static void main(String[] args) {

        List<State> stateList  = new ArrayList<>();
        //given the list of states, print state codes that begin with 'D'


        stateList.stream().filter(s->s.code.charAt(0)=='D').forEach(s->System.out.println(s));

        // code, State => code starts with 'D'
        List<State> tempOut = stateList.stream().filter(s -> s.code.charAt(0) == 'D').collect(Collectors.toList());


//        for(int i=0;i<5;i++){
//            for(int j=0;j<5;j++){
//                if(i==j || i+j == 4)
//                    System.out.print(arr[i][j]);
//            }
//        }

    }


    static class State{
        String name;
        String code;
    }

    public static void deleteNode(Node node){
        node.next=node.next.next;

    }

    public static void intergerStream(int nums){
        int top1 = Integer.MIN_VALUE;
        int top2 = Integer.MIN_VALUE;
        int top3 = Integer.MIN_VALUE;




    }

    //at T = t1, 1 5 3 4 8

    public static List<Integer> topK(){
        return null;

    }
}
class Node{
    int data;
    Node next;
}
