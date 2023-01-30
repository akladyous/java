import java.util.Arrays;

public class Primitive {

    public static void main(String[] args) {
        byte b = 1;
        short s = 1;
        int i1 = 1000;
        int i2 = 1000;
        i2 ++;
        long l = 100_000L;
        float f = 0.3F - -0.1F;

        System.out.println("args  = " + Float.MAX_EXPONENT + " " + Float.MAX_VALUE);
        System.out.println("float = " + f);
        System.out.println("copy of the value of i1 + i2 = " );
        System.out.println("i1 : " + i1 );
        System.out.println("i2 : " + i2 );
    }
}
