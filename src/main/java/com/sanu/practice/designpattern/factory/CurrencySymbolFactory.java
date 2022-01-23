package com.sanu.practice.designpattern.factory;

public class CurrencySymbolFactory {

    public static Currency createCurrency (String country){
        if(country.equalsIgnoreCase("India"))
            return new Rupee();
        else if(country.equalsIgnoreCase("USA"))
            return new USDollar();

        throw new UnsupportedOperationException("Country Does not Exist");
    }
}
