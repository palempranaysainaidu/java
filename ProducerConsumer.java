class Shared {
    int data;
    boolean available = false;

    synchronized void produce(int value) {
        while (available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        data = value;
        available = true;
        System.out.println("Produced: " + data);
        notify();
    }

    synchronized void consume() {
        while (!available) {
            try { wait(); } catch (InterruptedException e) {}
        }
        System.out.println("Consumed: " + data);
        available = false;
        notify();
    }
}

class Producer extends Thread {
    Shared shared;
    Producer(Shared shared) { this.shared = shared; }
    public void run() {
        for (int i = 1; i <= 5; i++) shared.produce(i);
    }
}

class Consumer extends Thread {
    Shared shared;
    Consumer(Shared shared) { this.shared = shared; }
    public void run() {
        for (int i = 1; i <= 5; i++) shared.consume();
    }
}

public class ProducerConsumer {
    public static void main(String[] args) {
        Shared shared = new Shared();
        new Producer(shared).start();
        new Consumer(shared).start();
    }
}
