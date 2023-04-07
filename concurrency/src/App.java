class Runner1 implements Runnable {
    @Override
    public void run() {
        for ( int i = 0; i < 5; i++ ) {
            System.out.println("Runnable One : " + i);
            for ( int j = 0; j < 10000; j++ ) {double x=i*i+Math.pow(i, 200);}
        }
    }
}

public class App {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(()->{
            for ( int i = 0; i < 5; i++ ) {
                System.out.println("Runnable Two : " + i);
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for ( int i = 0; i < 5; i++ ) {
                    System.out.println("Runnable Three : " + i);
                }
            }
        });

        thread1.start();
        thread2.start();
        thread3.start();


    }
}
