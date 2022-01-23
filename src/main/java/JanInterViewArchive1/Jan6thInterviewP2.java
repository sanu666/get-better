package JanInterViewArchive1;

import java.util.function.Function;

public class Jan6thInterviewP2 {
    public static void main(String[] args) {
//        System.out.println(CurrencyFactory.getCurrencyInstance("usa").getCurrency());

        Function<String,String> function = (String s)->s.toUpperCase();

        System.out.println(function.apply("ind"));
    }
}
