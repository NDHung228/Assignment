package Day8_7.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ex1 {

    public static void main(String[] args) {


        Runnable task1 = new Application(true);
        Thread thread1 = new Thread(task1);

        Runnable task2 = new Application2();
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();
    }
}

class Application2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i % 2 != 0) {
                System.out.println("Odd Number from oddThread: " + i);
            }

        }

    }
}
