package com.sda.java.advance.exercises;

public class Exercise19 {
    public static void main(String[] args) {
        Computer c1 =  new Laptop("15 gen7", 12, "T1000", "Dell", "Dell precision 5510","3000 mA");

        System.out.println(c1);
        System.out.println("Battery: " + ((Laptop)c1).getBattery()) ;
    }
}
