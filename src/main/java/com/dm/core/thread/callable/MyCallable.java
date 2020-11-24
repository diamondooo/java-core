package com.dm.core.thread.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public String call() throws Exception {
        Thread.sleep(5000);
        return "success call";
    }
}
