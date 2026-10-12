class NumberThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Number Thread: " + i);

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

class MessageThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Message Thread: Learning Java Multithreading");

            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        NumberThread t1 = new NumberThread();
        MessageThread t2 = new MessageThread();

        t1.start();
        t2.start();
    }
}