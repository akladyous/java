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

    }
}
