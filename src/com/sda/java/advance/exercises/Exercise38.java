package com.sda.java.advance.exercises;

public class Exercise38 {


    private  static  int litters = 10 ;

    private   static  Object lock =  new Object();

    public static void main(String[] args) {

        Thread removeLittes =  new Thread(()->{
            while (true){
                synchronized (lock){
                    if(litters<=0){
                        try {
                            System.out.println(Thread.currentThread().getName()+ " No litter remain");
                            lock.wait();
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    else{
                        litters--;
                        System.out.println(Thread.currentThread().getName()+ " Litters remained: " + litters);
                    }
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });


        Thread addLitters =  new Thread(()->{
            while (true){
                synchronized (lock){
                    litters++;
                    System.out.println(Thread.currentThread().getName()+  " Litters remained: " + litters);
                    lock.notify();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        removeLittes.start();
        addLitters.start();

    }
}
