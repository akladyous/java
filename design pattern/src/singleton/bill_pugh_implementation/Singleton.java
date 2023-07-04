package singleton.bill_pugh_implementation;

public class Singleton {

    private int data = 0;

    private Singleton(){}

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    };

    private static class SingletonHelper {
        // nested class is referenced after getInstance() is called.
        private static final Singleton uniqueInstance = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.uniqueInstance;
    };

}
