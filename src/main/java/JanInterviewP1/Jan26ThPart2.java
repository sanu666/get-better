package JanInterviewP1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Jan26ThPart2 {
    public static void main(String[] args) throws InterruptedException {

        MyThread thread1 =  new MyThread();
        MyThread thread2 = new MyThread();
        thread1.join();
        thread2.join();

        thread1.start();
        thread2.start();





        Integer[] arr  = new Integer[15];

        List<Integer> linkList = new LinkedList<> (Arrays.asList(arr));
//
         Arrays.stream(arr).distinct().collect(Collectors.toList());

//        for(int i=0;i<arr.length;i++)
//            integerList.add(arr[i]);
//
//        integerList.add(1);

    }
}
