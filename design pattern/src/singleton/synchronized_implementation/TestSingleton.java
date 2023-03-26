package singleton.synchronized_implementation;


public class TestSingleton {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.setData(55);
        System.out.println("Singleton first reference data is : " + singleton.getData());

        singleton = null;
        singleton = Singleton.getInstance();
        System.out.println("Singleton second reference data is : " + singleton.getData());
    }
}
