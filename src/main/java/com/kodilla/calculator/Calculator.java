package com.kodilla.calculator;

public class Calculator {

    public double add(double a, double b){
        System.out.println(a+b);
        return a+b;
    }

    public double substract(double a, double b){
        System.out.println(a-b);
        return a-b;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        calculator.add(5,7);
        calculator.substract(5,7);
    }
}
