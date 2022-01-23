//import com.sanu.ds.linkedlist.ListNode;
//
//import java.util.Arrays;
//
//public class Dec14Interview {
//    public static void main(String[] args) {
//
//        //int listSum1+ =listSum1*10+node.getElemet()
//
//
//        // int listSum2+ =listSum2*10+node.getElemet()
//
//        // int finalListSum = listSum1+listSum2
//        //while(finalListSum>0){
//
//       // ListNode = new ListNode(finalListSum%10)
//        // finalListSum/=final
//        fin
//
//        //
//        // 1->2->5 = 125
//        // 2->3->5 = 235
//
//        // 3->6->0 = 3600
//
//        // int a[] = {1,2,3,4,5},  k=2,k=3,k=4
//        // 2,3,4,5
//        // 3,4,5
//
//        // int b[] = { 4,89, 2, 0, 67, 1}  k=3
//        //89,89,67,67
//
//        // final output array = arr.length - k +1
//
//        int arr[] = {4,89, 2, 0, 67, 1}; // k=2, final length = 5
//
//        int k=3;
//        int outputArr[] = new int[arr.length-k+1];
//        for(int index=0;index<arr.length-k+1;index++){
//            outputArr[index]=maxElement(arr,index,index+k-1);
//        }
//        System.out.println(Arrays.toString(outputArr));
//    }
//
//
//    public static int maxElement(int arr[],int initial, int last){
//        int max = Integer.MIN_VALUE;
//        for(int i=initial;i<=last;i++){
//            if(arr[i]>max)
//                max=arr[i];
//        }
//        return max;
//    }
//}
