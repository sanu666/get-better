package DecInterviewArchive;

import java.util.Arrays;

public class Dec13Interview {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5};
        System.out.println(Arrays.stream(arr).distinct());

//       System.out.println(Arrays.toString(arraySum(new int[]{1,2,3,4,10},9)));


    }

    public static int[] arraySum(int arr[], int target){

        if(arr.length<0){
            return new int[]{-1};
        }
        if(arr.length==1){
            if(arr[0]==target)
                return new int[]{0};
        }

        int firstPointer = 0;
        int secondPointer = 1;


        int max = arr[firstPointer];
        while (firstPointer<secondPointer){
            max+=arr[secondPointer];
            if(max==target)
                return new int[]{firstPointer,secondPointer};
            if(max>target){
                max-=arr[firstPointer];
                firstPointer++;
            }

            secondPointer++;
        }

        return  new int[]{-1};

    }

    public static int findArraySum(int arr[], int i, int j){
        int sum=0;
        for(int index=i;index<=j;index++){
            sum+=arr[index];
        }
        return sum;
    }

    public static class Dec15Interview {

        public static void main(String[] args) {

        }
    }

    public static class Dec17Interview {

        public static void main(String[] args) {

            long arr[] = {3, 2, 1, 56, 10000, 167};

            Arrays.sort(arr);
            System.out.println(arr[0]);
            System.out.println(arr[arr.length-1]);

            long min = Long.MAX_VALUE;
            long max = Long.MIN_VALUE;

            for(long element:arr){
                if(element>max)
                    max=element;

                if(element<min)
                    min=element;
            }

            System.out.println(max);
            System.out.println(min);

        }

    //    public String oddEven(int num){
    //
    //        Predicate<Integer> oddEven = (n)->n%2==0;
    //
    //
    //        return oddEven.test(num);
    //    }
    }
}


//
//        while (firstPointer<=secondPointer){
//            tempSum=findArraySum(arr,firstPointer,secondPointer);
//            if(tempSum==target){
//               return new int[]{firstPointer,secondPointer};
//            }
//            if(secondPointer==arr.length-1) {
//                secondPointer = firstPointer + 1;
//                firstPointer++;
//            }
//            else secondPointer++;
//
//        }