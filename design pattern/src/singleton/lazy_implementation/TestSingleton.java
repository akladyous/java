package singleton.lazy_implementation;

public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(1);


        System.out.println("Singleton data is : " + singleton.getData());
    }
}
