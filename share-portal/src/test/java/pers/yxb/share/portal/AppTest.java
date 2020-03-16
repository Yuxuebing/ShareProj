package pers.yxb.share.portal;

/**
 * Unit test for simple App.
 */
public class AppTest {
    public static void main(String[] args) {
        final Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread-" + Thread.currentThread().getName());
            }
        },"t1");
        final Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t1.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-" + Thread.currentThread().getName());
            }
        },"t2");
        final Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    t2.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread-" + Thread.currentThread().getName());
            }
        },"t3");
        t3.setDaemon(true);
        t3.start();
        t1.start();
        t2.start();
        System.out.println(t3.isAlive() + " " + t2.isAlive() + " " + t1.isAlive());

    }
}

