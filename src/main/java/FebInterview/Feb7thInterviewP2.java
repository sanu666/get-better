package FebInterview;

import java.util.HashMap;

public class Feb7thInterviewP2 {
    public static void main(String[] args) {
        System.out.println(calculateAngle(12,15));
        
    }

    // 3:28
    // the angle between minute and hour hand.
    // 3:20 -> calculateAngle(int h, int m) -> double output
    // 12:00 -> 0
    // 13:00 -> 30
    // 14:00 -> 60

    // 12:30 -> 165
    //12:15 -> h->12, m->15 -> div/5

    /**
     * So for every hour increase hour will increase the degree by 30
     *
     * min-> 6
     * degreeMin -> 6*30 = 180
     * degreeHour -> (min/60)*30 -> 15
     *
     * degree = degreeMin-degreeHour
     *
     * 12:15
     * degreeMin-> minHand*30 = 90
     * hourhand-> (15/60)*30 = 90-7.5 = 82.5
     *
     * 3:20
     * degreeMin = 120
     * hour = 20/60 * 30 = 10 + 30*hour
     * degree = 20
     *
     */

    public static double calculateAngle(int h, int m){
//        HashMap<Integer,Integer> hourLookUp = new HashMap<>();
//        hourLookUp.put(12,0);
//        hourLookUp.put(1,30);
//        hourLookUp.put(2,60);
//        hourLookUp.put(11,30);
//        360-hour*30

        int handMin = m/5;
        double degreeMin = handMin*30;

        double degreeHourForTwelve = ((double) m/60)*(30);

        return Math.abs(degreeMin-degreeHourForTwelve);


    }


}
