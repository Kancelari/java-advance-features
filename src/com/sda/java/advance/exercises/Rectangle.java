package com.sda.java.advance.exercises;

public class Rectangle extends Shape{

    private  double a ;

    private  double b ;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    double calculatePerimeter() {
        return 2*(a+b);
    }

    @Override
    double calculateArea() {
        return a*b;
    }
}
