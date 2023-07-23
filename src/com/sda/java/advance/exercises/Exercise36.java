package com.sda.java.advance.exercises;

public class Exercise36 {

    public static class  ThreadPlaygroundRunnable implements Runnable{

        private String name;

        public ThreadPlaygroundRunnable(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for(int i =1 ; i<=10; i++){
                System.out.println(Thread.currentThread().getName() + " " + name + " " + i );
            }

        }
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new ThreadPlaygroundRunnable("klaus"));
        Thread t2 =  new Thread(new ThreadPlaygroundRunnable("sda"));

        t1.start();
        t2.start();
    }
}
