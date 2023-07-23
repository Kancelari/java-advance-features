package com.sda.java.advance.exercises;

public class Hexagon extends Shape{

    private double a;

    public Hexagon(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }


    @Override
    double calculatePerimeter() {
        return 6*a;
    }

    @Override
    double calculateArea() {
        return a*a*(1+ Math.sqrt(3)/2);
    }
}
