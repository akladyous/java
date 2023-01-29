public class OverLoadedMethods {

    public static void main(String[] args) {
      boolean result = prova(1, 2);
        System.out.println(result);
    }

    private static boolean prova (int a, int b) {
        return a == b ? true : false;
    }

}
