package Day8_7.exercise;

public class Application implements Runnable {

    public boolean isEven;

    public Application(boolean isEven) {
        this.isEven = isEven;
    }


    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (i%2 ==0) {
                System.out.println("Even Number from evenThread: " + i);
            }

        }

    }
}
