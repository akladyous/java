class Runner1 implements Runnable {
    @Override
    public void run() {
        for ( int i = 0; i < 5; i++ ) {
            System.out.println("Runnable One : " + i);
            for ( int j = 0; j < 1000000; j++ ) {double x=i*i+Math.pow(i, 200);}
        }
    }
}

public class App {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(()->{
            for ( int i = 0; i < 5; i++ ) {
                try {
                    Thread.sleep(i*100);
                    System.out.println("Runnable Two : " + i);
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
                        System.out.printf("%-10s iteration: %d%n",Thread.currentThread().getName(),i );
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
