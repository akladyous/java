package runnable;

public class ThreadInterruption1 {
    public static void main(String[] args) {
        Thread thread = new Thread(new BlockingTask());
        thread.start();
        thread.interrupt();
    }

    private static class BlockingTask implements Runnable {
        @Override
        public void run(){
            System.out.printf("%-10s ", Thread.currentThread().getName());
            try {
                System.out.println("sleeping 18 seconds");
                Thread.sleep(18000);
            } catch (InterruptedException e) {
                System.out.printf("Exiting thread %-15s%n", Thread.currentThread().getName());
//                throw new RuntimeException(e);
            }
        }
    }
}
