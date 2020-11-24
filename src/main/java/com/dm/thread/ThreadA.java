package com.dm.thread;

public class ThreadA extends Thread {
    public ThreadA(Runnable target) {
        super(target);
    }
}
