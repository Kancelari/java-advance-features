package com.sda.java.advance.exercises;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Joiner<T> {

    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T ...a){
        String str  = "";
        if(a==null || a.length==0){
            return str;
        }
        return String.join(separator,Arrays.stream(a).map(el -> el.toString()).collect(Collectors.toList()));
    }
}
