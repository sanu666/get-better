package com.sanu.practice.designpattern.factory;

public class USDollar implements Currency{
    @Override
    public String getSymbol() {
        return "USD";
    }
}
