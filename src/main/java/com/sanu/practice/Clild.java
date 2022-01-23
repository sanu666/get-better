package com.sanu.practice;

import java.util.ArrayList;
import java.util.List;

public class Clild extends BaseClass{

    public static void main(String[] args) {
        List<Integer> str = new ArrayList<>();
        str.add(1);
        str.add(2);
        str.add(3);

        int max=-1;

        for (int a: str){
            if(a>max){
                max=a;
            }
        }



        System.out.println(max);



//        str.stream().filter(s->s=="1").collect(Collectors.toList());
//        str.stream().max()

    }
}
