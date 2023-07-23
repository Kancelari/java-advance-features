package com.sda.java.advance.exercises;

public class MeasurementConverter {

    public  double convert(double value, ConversionType conversionType){
        return  (value * conversionType.getY()) / conversionType.getX() ;
    }
}
