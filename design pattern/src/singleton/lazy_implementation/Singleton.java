package singleton.lazy_implementation;

public class Singleton {

    private int data = 0;
    private static Singleton uniqueInstance = null;

    private Singleton(){};

    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;
    }


    public static Singleton getInstance(){
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        };
        return uniqueInstance;
    };

}
