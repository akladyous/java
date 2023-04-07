class Runner1 implements Runnable {
    @Override
    public void run() {
        for ( int i = 0; i < 5; i++ ) {
            System.out.println("Runnable One : " + i);
        }
    }
}
class Runner2 implements Runnable {
    @Override
    public void run() {
        for ( int i = 0; i < 5; i++ ) {
            System.out.println("Runnable Two : " + i);
        }
    }
}
public class App {
    public static void main(String[] args) {
        Runner1 runner1 = new Runner1();
        Runner2 runner2 = new Runner2();
        Thread thread1 = new Thread(runner1);
        Thread thread2 = new Thread(runner2);
        thread1.start();
        thread2.start();


    }
}
