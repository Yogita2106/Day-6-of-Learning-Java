public class ThreadExample {

    public static void main(String[] args) {
        // Create two threads, one for 'A' to 'E' and another for 'F' to 'J'
        Thread thread1 = new Thread(new PrintChars('A', 'E'));
        Thread thread2 = new Thread(new PrintChars('F', 'J'));

        // Start the threads
        thread1.start();
        thread2.start();
    }

    // Inner class to print characters
    static class PrintChars implements Runnable {
        private final char start;
        private final char end;

        public PrintChars(char start, char end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (char c = start; c <= end; c++) {
                System.out.print(c + " ");
                try {
                    Thread.sleep(200); // Add a small delay for better visualization
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
        }
    }
}