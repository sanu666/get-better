package com.sanu.algo.array;

public class AllCombinationsOfGivenArray {

    public static void main(String[] args) {

        printAllCombos(new char[]{'1','2','3'});

    }

    /**
     * Input:
     * S = {a, b, c, d}
     * Output:
     * {}, {a} , {b}, {c}, {d}, {a,b}, {a,c},
     * {a,d}, {b,c}, {b,d}, {c,d}, {a,b,c},
     * {a,b,d}, {a,c,d}, {b,c,d}, {a,b,c,d}
     *
     *
     * Set  = [a,b,c]
     * power_set_size = pow(2, 3) = 8
     * Run for binary counter = 000 to 111
     *
     * Value of Counter            Subset
     *     000                    -> Empty set
     *     001                    -> a
     *     010                    -> b
     *     011                    -> ab
     *     100                    -> c
     *     101                    -> ac
     *     110                    -> bc
     *     111                    -> abc
     */
    public static void findCombination(char arr[]){

        long powerSet = (long) Math.pow(2,arr.length);

        int counter,j;

        for(counter=0;counter<powerSet;counter++){
            for (j=0;j<arr.length;j++){
                if((counter & (1 << j)) > 0)
                    System.out.print(arr[j]);
            }
            System.out.println();
            }
        }


























        public static void printAllCombos(char[] n){

        long powerSet  = (long) Math.pow(2,n.length);

        for(int i=0;i<powerSet;i++){
            for(int j=0;j<n.length;j++){
                if((i & ( 1 << j))>0){
                    System.out.print(n[j] +" ");
                }
            }
            System.out.println();
        }







        }

}
