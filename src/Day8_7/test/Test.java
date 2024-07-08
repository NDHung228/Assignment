package Day8_7.test;

public class Test implements Runnable {
    private String name;

    public Test(String name) {
        this.name = name;
    }

    @Override
    public void run() { // Phương thức runӿԀ chứa những công việc cần làm trong thread đó
        System.out.println(Thread.currentThread().getName() + ": " + name);
        for (int i = 0; i < 10; i++) {
            System.out.println(name +" " +i);
        }
    }

    public static void main(String[] args) {
        Runnable task1 = new Test("Tấn");
        Runnable task2 = new Test("Hưng");
        Thread thread1 = new Thread(task1);
//        Thread thread2 = new Thread(task2);
        thread1.start();
        Thread thread2 = new Thread(task2);
        thread2.start();
    }

}
