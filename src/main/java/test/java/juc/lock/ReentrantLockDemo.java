package test.java.juc.lock;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author xzw
 * @date 2019/8/29
 **/
public class ReentrantLockDemo implements Runnable {
    //重入锁ReentrantLock
    public static ReentrantLock lock1 = new ReentrantLock();
    public static ReentrantLock lock2 = new ReentrantLock();

    int lock;
    public ReentrantLockDemo(int lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        try {
            if (lock == 1) {
                while (true) {
                    if (lock1.tryLock()) {
                        try {
                            Thread.sleep(1000);
                        } finally {
                            lock1.unlock();
                        }
                    }

                    if (lock2.tryLock()) {
                        try {
                            System.out.println("thread " + Thread.currentThread().getId() + " 执行完毕");

                            return;
                        } finally {
                            lock2.unlock();
                        }
                    }
                }

            } else {
                while (true) {
                    if (lock2.tryLock()) {
                        try {
                            Thread.sleep(1000);
                        } finally {
                            lock2.unlock();
                        }
                    }

                    if (lock1.tryLock()) {
                        try {
                            System.out.println("thread " + Thread.currentThread().getId() + " 执行完毕");
                            return;
                        } finally {
                            lock1.unlock();
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ReentrantLockDemo r1 = new ReentrantLockDemo(1);
        ReentrantLockDemo r2 = new ReentrantLockDemo(2);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);
        t1.start();
        t2.start();
    }
}