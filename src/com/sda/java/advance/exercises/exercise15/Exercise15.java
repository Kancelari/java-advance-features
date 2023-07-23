package com.sda.java.advance.exercises.exercise15;

public class Exercise15 {
    public static void main(String[] args) {

        Car c1 = Car.BMW;
        Car c2 = Car.FIAT;

        System.out.println("c1: " + c1);
        System.out.println("c1 regular: " + c1.isRegular());

        System.out.println("c2: " + c2);
        System.out.println("c2 regular: " + c2.isRegular());

        System.out.println("c1 faster than c2: " + c1.isFasterThan(c2));

    }
}
