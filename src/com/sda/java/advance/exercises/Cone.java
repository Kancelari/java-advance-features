package com.sda.java.advance.exercises;

public class Cone extends  DDDShape{


    private  double r ;

    private  double h ;



    public Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }


    @Override
    double calculateVolume() {
        return 1/3.0 * 3.14 * r*r * h;
    }

    @Override
    double calculatePerimeter() {
        return 0;
    }

    @Override
    double calculateArea() {
        double l = Math.sqrt(r*r + h*h);
        return 3.14*r*(l + r);
    }
}
