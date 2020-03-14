package test.java.juc;

import java.util.concurrent.CountDownLatch;

/**
 * @author xzw
 * @date 2019/8/28
 *    CountDownLatch是java1.5版本之后util.concurrent提供的工具类。
 *    这里简单介绍一下CountDownLatch，可以将其看成是一个计数器，await()
 *    方法可以阻塞至超时或者计数器减至0，其他线程当完成自己目标的时候可以减少1，
 *    利用这个机制我们可以将其用来做并发。 比如有一个任务A，它要等待其他4个任务执行完毕之后才能执行，此时就可以利用CountDownLatch来实现这种功能了。
 **/
public class TestCountDownLatch {
    public static void main(String[] args){

        int threadCount = 10;

        final CountDownLatch latch = new CountDownLatch(threadCount);
        for (int i = 0; i < threadCount; i++) {

            new Thread(new Runnable() {

                @Override
                public void run() {
                    System.out.println("线程" + Thread.currentThread().getId() + "开始出发");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("线程" + Thread.currentThread().getId() + "已到达终点");

                    latch.countDown();
                }
            }).start();
        }

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("10个线程已经执行完毕！开始计算排名");
    }
}
