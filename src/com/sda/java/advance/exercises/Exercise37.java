package com.sda.java.advance.exercises;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exercise37 {
    public static void main(String[] args) {
        ExecutorService executor =  Executors.newFixedThreadPool(2);

        int c = 0 ;

        for(int i = 0 ; i<10; i++){
            executor.submit(new Exercise36.ThreadPlaygroundRunnable("sda "+ i));
        }

        executor.shutdown();
    }
}
