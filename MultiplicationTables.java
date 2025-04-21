public class MultiplicationTables {

    public static void main(String[] args) {
        // Create a thread using Thread class for table of 2
        MultiplicationThread thread2 = new MultiplicationThread(2);
        thread2.start();

        // Create a thread using Runnable interface for table of 3
        Runnable thread3Runnable = new MultiplicationRunnable(3);
        Thread thread3 = new Thread(thread3Runnable);
        thread3.start();
    }
}

// Thread class implementation
class MultiplicationThread extends Thread {
    private final int number;

    public MultiplicationThread(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Multiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

// Runnable interface implementation
class MultiplicationRunnable implements Runnable {
    private final int number;

    public MultiplicationRunnable(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("\nMultiplication table of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}