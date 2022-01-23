package JanInterviewP1;

public class Jan19thInterview {

    public static void main(String[] args) {

        int[][] arr = new int[][]{{1,2,3},{1, 3, 5},{4,6,7}};

        printMatrixInRightDiagonal(arr,3);
    }

//    1 2 3
//    1 3 5
//    4 6 7

//   /**
    /**
     * 1 2 1 3 3 4 5 6 7
     * 0,0  0,1  1,0  0,2  1,1  2,0  1,2 2,1  2,2
     *
     */

    public static void printMatrixInRightDiagonal(int nums[][],int n){

        int counter=1;
        for(int i = 0; i<n;i++){
            for(int j=0; j<n; j++){
                if(i+j<=counter)
                    System.out.print(nums[i][j]);

            }
            counter++;

        }

    }

}
