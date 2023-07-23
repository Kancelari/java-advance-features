package com.sda.java.advance.exercises;

public class Exercise21 {
//exercise 21 and 22
    public static void main(String[] args) {
        Cone c1 = new Cone(2, 3);
        Cube c2 = new Cube(4);

        System.out.printf("c1 area: %.2f\n", c1.calculateArea());
        System.out.printf("c1 volume: %.2f\n", c1.calculateVolume());

        System.out.printf("c2 area: %.2f\n", c2.calculateArea());
        System.out.printf("c2 volume: %.2f\n", c2.calculateVolume());

        c1.fill(12);
        c2.fill(77.8);
    }
}
