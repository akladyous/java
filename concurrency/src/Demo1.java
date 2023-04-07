class Runner1 implements Runnable {
    @Override
    public void run() {
        for ( int i = 0; i < 5; i++ ) {
            System.out.printf("%-10s Priority %-10s iteration: %d%n",Thread.currentThread().getName(), Thread.currentThread().getPriority() ,i );
            for ( int j = 0; j < 1000000; j++ ) {double x=i*i+Math.pow(i, 200);}
        }
    }
}

public class Demo1 {
    public static void main(String[] args) {

        Runner1 runner1 = new Runner1();
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(()->{
            for ( int i = 0; i < 5; i++ ) {
                try {
                    Thread.sleep(i*100);
                    System.out.printf("%-10s Priority %-10s iteration: %d%n",Thread.currentThread().getName(), Thread.currentThread().getPriority() ,i );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for ( int i = 0; i < 5; i++ ) {
                    try {
                        Thread.sleep(i*250);
                        System.out.printf("%-10s Priority %-10s iteration: %d%n",Thread.currentThread().getName(), Thread.currentThread().getPriority() ,i );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thread1.setName("Thread I");
        thread1.start();
        thread2.setName("Thread II");
        thread2.start();

        thread3.setName("Thread III");
        thread3.setPriority(Thread.MAX_PRIORITY);
        thread3.start();


    }
}
