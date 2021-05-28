package com.aak.blindsevenfive.threads;

import java.util.Random;

public class MyThread implements Runnable{
    @Override
    public void run() {
        Random rand = new Random();
        int randomNumber = rand.nextInt();
        System.out.println("Hello Random" + randomNumber + "in thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
