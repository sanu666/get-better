package com.sanu.practice.designpattern.factory;

public class Rupee implements Currency{
    @Override
    public String getSymbol() {
        return "INR";
    }
}
