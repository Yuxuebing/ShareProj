package pers.yxb.share.portal;

import java.util.concurrent.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Unit test for simple App.
 */
public class AppTest {
    // 定义一个锁
    private static Lock lock = new ReentrantLock();

    public static void main(String[] args) {
        // 线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(5, 10, 200, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(5));;
        executor.execute(() -> {
            System.err.println("线程1尝试获取lock锁...");
            //lock.lock();
            try {
                System.err.println("线程1拿到锁并进入try，准备执行testForLock方法");
                // 调用下方的方法，验证lock的可重入性
                testForLock();
                TimeUnit.MILLISECONDS.sleep(500);
                System.err.println("线程1try模块全部执行完毕，准备释放lock锁");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                //lock.unlock();
                System.err.println("线程1释放lock锁，线程1释放锁2次，此时才算真正释放，验证了ReentrantLock加锁多少次就要释放多少次锁");
            }
        });

        // 先睡他100ms，保证线程1先拿到锁
        try {
            TimeUnit.MILLISECONDS.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.execute(() -> {
            System.err.println("线程2尝试获取lock锁...");
            //lock.lock();
            try {
                System.err.println("线程2拿到锁并进入try");
            } finally {
                //lock.unlock();
                System.err.println("线程2执行完毕，释放lock锁");
            }
        });
    }

    public static void testForLock() throws InterruptedException {
        System.err.println("线程1开始执行testForLock方法，正准备获取lock锁...");
        lock.lock();
        try {
            System.err.println("testForLock成功获取lock锁,证明了ReentrantLock具有可重入性");
            TimeUnit.MILLISECONDS.sleep(200);
        } finally {
            lock.unlock();
            System.err.println("testForLock释放lock锁，线程1释放锁一次");
        }
    }
}


