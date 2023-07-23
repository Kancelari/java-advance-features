package com.sda.java.advance.exercises;

public class Exercise17 {
    public static void main(String[] args) {
        MeasurementConverter converter = new MeasurementConverter();

        System.out.println("3 inch to cm: " + converter.convert(3.0, ConversionType.INCHES_TO_CENTIMETERS));
    }
}
