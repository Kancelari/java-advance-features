package com.sda.java.advance.exercises;

public class Exercise27 {
    public static void main(String[] args) {
        Joiner<Integer> j1  =  new Joiner<>("-");

        System.out.println(j1.join(2,4,2,34,34));

        Joiner<Integer> j2  =  new Joiner<>("-+-");

        System.out.println(j2.join(2,4,2,34,34));
    }
}
