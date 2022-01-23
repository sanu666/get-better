package JanInterViewArchive1;

import static java.util.Comparator.comparingInt;
import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;

import java.util.*;
import java.util.stream.Collectors;

public class Jan8thInterviewP1 {

    public static void main(String[] args) {

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){

            }
        }

    }

    // 20 30 40 50 60


    // 40 50 60 20 30

    // 30 40 50 60 20

    public static int findMyComplexity(int n){

        if(n<=1)
            return 1;

        return findMyComplexity(n-1)+findMyComplexity(n-2);
    }

    // 1st -> n=5 findMyComplexity(5)
    /**
     *
     * 1st -> n=5 findMyComplexity(5)
     *
     * 2nd -> findMyComplexity(4) findMyComplexity(3)
     *
     * 3rd->findMyComplexity(3) findMyComplexity(1)
     *
     * 4th findMyComplexity(2)
     *
     * 5th  findMyComplexity(1)
     *
     */
}
