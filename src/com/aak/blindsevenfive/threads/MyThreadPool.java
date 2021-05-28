package com.aak.blindsevenfive.threads;

import java.util.concurrent.*;

public class MyThreadPool {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for(int i = 0; i<10000; i++){
            Runnable worker = new MyThread();
            Future<Integer> integerFuture = executorService.submit(worker, new Integer(1));
        }
        try {
            executorService.shutdown();
            executorService.awaitTermination(2, TimeUnit.HOURS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
