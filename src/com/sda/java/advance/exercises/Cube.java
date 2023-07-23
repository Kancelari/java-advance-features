package com.sda.java.advance.exercises;

public class Cube extends DDDShape{

    private double a ;

    public Cube(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    double calculateVolume() {
        return a*a*a;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        return 6*a*a;
    }
}
