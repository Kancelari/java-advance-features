package com.sda.java.advance.exercises;

public abstract class DDDShape extends Shape implements Fillable {

    abstract double calculateVolume();

    @Override
    public void fill(double volume) {
        if (calculateVolume() > volume) {
            System.out.println("not pouring enough water");
        } else if (calculateVolume() < volume) {
            System.out.println("will pour too much water into the figure and overflow");
        } else {
            System.out.println("fill the figure with water to the brim");
        }
    }
}
