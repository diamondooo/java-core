package com.dm.core.thread.callable;

import java.util.concurrent.*;

public class CallableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> future = new FutureTask<String>(new MyCallable());
        ExecutorService exec = Executors.newFixedThreadPool(2);
        Future<?> submit = exec.submit(future);
        System.out.println(submit.get());
    }
}
