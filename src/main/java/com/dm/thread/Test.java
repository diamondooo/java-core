package com.dm.thread;

import java.util.stream.IntStream;

public class Test {
    public static void main(String[] args) {
        IntStream.range(0, 5).mapToObj(Test::createThread).forEach(Thread::start);
    }

    public static Thread createThread(final int initName) {
        return new Thread(()->{
            System.out.println(Thread.currentThread().getName());
        }, "huyuhao-"+initName);
    }
}
