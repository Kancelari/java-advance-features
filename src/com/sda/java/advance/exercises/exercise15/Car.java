package com.sda.java.advance.exercises.exercise15;

public enum Car {

    FERRARI(200000, 800 , false),
    PORSCHE(180000, 700, false),
    MERCEDES(100000, 600 , false),
    BMW(100000, 630, false),
    OPEL(20000, 100, true),
    FIAT(23000, 100, true),
    TOYOTA(15000, 150, true) ;

    private  final  double price ;

    private  final  int power  ;

    private final  boolean regular;

    Car(double price, int power, boolean regular) {
        this.price = price;
        this.power = power;
        this.regular = regular;
    }


    public  boolean isPremium(){
        return  !regular;
    }

    public double getPrice() {
        return price;
    }

    public int getPower() {
        return power;
    }

    public boolean isRegular() {
        return regular;
    }

    public  boolean isFasterThan(Car car){
        return  power>car.getPower();
    }
}
