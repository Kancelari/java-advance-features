package com.sda.java.advance.exercises;

public class Exercise20 {



    public static void main(String[] args) {
        Triangle t1 =  new Triangle(3.0,4.0,5.0) ;
        System.out.println("T1 perimeter: " + t1.calculatePerimeter());
        System.out.println("T1 area: " + t1.calculateArea());

        Rectangle r1 =  new Rectangle(3.0,4.0) ;
        System.out.println("r1 perimeter: " + r1.calculatePerimeter());
        System.out.println("r1 area: " + r1.calculateArea());


        Hexagon h1 =  new Hexagon(4.0) ;
        System.out.println("h1 perimeter: " + h1.calculatePerimeter());
        System.out.println("h1 area: " + h1.calculateArea());

    }
}
