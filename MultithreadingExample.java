class MyThread extends Thread {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Thread class: " + i);
        }
    }
}

class MyRunnable implements Runnable {
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println("Runnable interface: " + i);
        }
    }
}

public class MultithreadingExample {
    public static void main(String[] args) {
        new MyThread().start();
        new Thread(new MyRunnable()).start();
    }
}
