package com.sda.java.advance.exercises;

import java.util.ArrayList;
import java.util.List;

public class Exercise23 {
    public static void main(String[] args) {
        Zoo z1 = new Zoo(new ArrayList<>(List.of("tiger", "luan", "ari", "luan", "zeber", "elefant", "majmun", "majmun", "shimpaze", "luan", "tiger", "majmun")));
        System.out.println("animals: " + z1.getAnimals());

        System.out.println("Frequency map: " + z1.getAnimalsCount());

        System.out.println("Frequency map sorted: " + z1.getAnimalsCountSorted());

        z1.addAnimal("shqiponje", 10);

        System.out.println("animals: " + z1.getAnimals());

        System.out.println("Frequency map: " + z1.getAnimalsCount());

        System.out.println("Frequency map sorted: " + z1.getAnimalsCountSorted());



    }
}
