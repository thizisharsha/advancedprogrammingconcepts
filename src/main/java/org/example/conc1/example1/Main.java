package org.example.conc1.example1;

public class Main {
    public static void main(String[] args) {
        BasicThread bt=new BasicThread();
        Thread thread=new Thread(bt);
        thread.start();
        System.out.println("I am in the main thread,proof is this"+Thread.currentThread().getName());
    }
}
