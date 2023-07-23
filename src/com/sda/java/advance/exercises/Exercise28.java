package com.sda.java.advance.exercises;

import java.util.List;

public class Exercise28 {
    public static void main(String[] args) {
        ExtendedArrayList<String> ls =  new ExtendedArrayList<>(List.of("a", "b", "c", "d", "e", "f", "g", "f", "d", "f"));

        System.out.println(ls.getEveryNthElement(2,3));

        System.out.println(ls.partOf(e->e.equals("f")));

}
}
