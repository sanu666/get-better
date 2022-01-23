package com.sanu.practice;

public class TestClass1 {
    public static void main(String[] args) {

        MyThreadClass myThreadClass1 = new MyThreadClass();
        myThreadClass1.start();
    }

//        String arr[] = {"1,2","~","3,4"};
//        List<String> stringList = Arrays.asList(arr);
//
//        List<String> filteredList = stringList.stream().filter(s -> s.length() == 3).collect(Collectors.toList());
//        List<String> finalList = new ArrayList<>();
//        for(String s:filteredList){
//            finalList.addAll(Arrays.asList(s.split(",")));
//        }
//
//        List<Integer> stringFinalList = finalList.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
//        System.out.println(stringFinalList);
//    }


}
