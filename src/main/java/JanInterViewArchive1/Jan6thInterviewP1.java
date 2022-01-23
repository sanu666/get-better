package JanInterViewArchive1;

import com.sanu.practice.designpattern.factory.CurrencySymbolFactory;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class Jan6thInterviewP1 {

    public static void main(String[] args) {

//        System.out.println(CurrencySymbolFactory.createCurrency("INDIA").getSymbol());
    }
    }
//
//        /**
//         * convert a list of String into a list of Integer and then filter all even numbers using java 8
//         */
//
//        System.out.println(findNumberOfRotations(new int[]{15, 18, 2, 3, 6, 12}));
//
//
////        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
////
//////        Jan6thInterviewP1 jan6thInterviewP1 = Jan6thInterviewP1::new;
////        HashMap<String,String> tessthashMap = new HashMap<>();
////        tessthashMap.put("key1","value1");
////        tessthashMap.put("key2","value1");
////
////        List<Integer> integerList = numbers.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
////        List<Integer> outputEven = integerList.stream().filter(x->x%2==0).collect(Collectors.toList());
////        System.out.println(outputEven);
//
//    }
//
//    /**
//     * find the number of rotations from a sorted array
//     * {15, 18, 2, 3, 6, 12}
//     * {2 3 6 12 15 18}
//     *
//     * {18 2 3 6 12 15}
//     * {15 18 2 3 6 12}
//     *
//     * output = 2
//     *
//     * {}
//     */
//
//    public static int findNumberOfRotations(int[] arr){
//
////        int min = Integer.MAX_VALUE;
////        int indexOfMin = 0;
////
////        for(int i=0;i<arr.length;i++){
////            if(arr[i]<min){
////                min=arr[i];
////                indexOfMin=i;
////            }
////        }
//        if(arr.length<2){
//            return 0;
//        }
//
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i]>arr[i+1]){
//                return i+1;
//            }
//        }
//        return 0;
//
//    }
//}
