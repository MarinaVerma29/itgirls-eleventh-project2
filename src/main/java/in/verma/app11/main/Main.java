package in.verma.app11.main;

public class Main {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Поток_1: " + i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Поток_2: " + i);
            }
        });


        try {
            thread1.start();
            thread1.join();

            thread2.start();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
