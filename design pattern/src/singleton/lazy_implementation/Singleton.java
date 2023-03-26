package singleton.lazy_implementation;

public class Singleton {

    private static Singleton uniqueInstance = null;

    // instance attribute variables
    private int data = 0;

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }

    private Singleton(){};

    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        };
        return uniqueInstance;
    };

}
