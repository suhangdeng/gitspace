package com.bjsxt.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(2);
        //任务1
        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("任务1正在执行任务...");
                    Thread.sleep((long) (Math.random() * 1000));
                    System.out.println("任务1执行完毕...");
                    latch.countDown();//调用count计数器减1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    System.out.println("任务2正在执行任务...");
                    Thread.sleep((long) (Math.random() * 1000));
                    System.out.println("任务2执行完毕...");
                    latch.countDown();//调用coundown的时候计数器会减1
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
        //主线程
        System.out.println("等待其他2个任务执行完毕，主线程才开始执行任务" + Thread.currentThread().getName() );
        try {
            latch.await();
            System.out.println("其他两个任务执行完毕，主线程执行任务：" + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
