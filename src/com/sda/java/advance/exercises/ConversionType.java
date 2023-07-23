package com.sda.java.advance.exercises;

public enum ConversionType {
    METERS_TO_YARDS(1.0 , 1.0936),

    YARDS_TO_METERS(1.0, 0.9144),
    CENTIMETERS_TO_ICHES(1.0 , 0.394),
    INCHES_TO_CENTIMETERS(1.0, 2.54),
    KILOMETERS_TO_MILES(1.0, 0.62),
    MILES_TO_KILOMETERS(1.0, 1.6) ;

    private final  double x ;

    private  final  double y ;

    ConversionType(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
