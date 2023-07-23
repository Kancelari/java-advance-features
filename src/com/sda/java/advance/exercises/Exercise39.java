package com.sda.java.advance.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Exercise39 {
    private static List<Integer> results =  new ArrayList<>();
    private  static  Object lock =  new Object();

    private  static Random random = new Random();

    public static void main(String[] args) {

        Thread reader1 =  new Thread(()->{
            while (true){
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+" Results"+ results);
                }
            }
        }) ;

        Thread reader2 =  new Thread(()->{
            while (true){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+" Results"+ results);
                }
            }
        }) ;


        Thread sensor1 = new Thread(()->{
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+" Results"+ results);
                    results.add(random.nextInt(20));
                    System.out.println(Thread.currentThread().getName()+" Results"+ results);
                }
            }
        });


        Thread sensor2 = new Thread(()->{
            while (true){
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                synchronized (lock){
                    System.out.println(Thread.currentThread().getName()+" Results"+ results);
                    if(results.size()==0){
                        continue;
                    }
                    results.remove(results.size()-1);
                    System.out.println(Thread.currentThread().getName()+" Results"+ results);
                }
            }
        });


        reader1.start();
        reader2.start();
        sensor1.start();
        sensor2.start();


    }
}
