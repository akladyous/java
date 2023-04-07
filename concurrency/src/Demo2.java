public class Demo2 {

    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();
    }

    private static class MyThread extends Thread {
        @Override
        public void run(){
            System.out.printf("%-10s", this.getName());
        }

    }
}
