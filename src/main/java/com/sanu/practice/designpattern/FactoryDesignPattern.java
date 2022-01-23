package com.sanu.practice.designpattern;

import com.sanu.practice.designpattern.factory.CurrencySymbolFactory;

public class FactoryDesignPattern {

    public static void main(String[] args) {

        //Say I have a requirement to get currency symbols for each currency.

        /**
         * Factory method design pattern decouples the calling class from the target class,
         * which result in less coupled and highly cohesive code
         */

        System.out.println(CurrencySymbolFactory.createCurrency("india").getSymbol());

    }
}
