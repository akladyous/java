import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithArray {
    public static void main(String[] args) {
        int[] arrayInt;
        arrayInt = new int[5];

        List<Integer> list= new ArrayList<>();
        list.
        int[] arrayInt1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arrayInt2 = new int[5];

        System.out.println("arrayInt1.Values : " + Arrays.toString(arrayInt1));
        System.out.println("arrayInt2.values : " + arrayInt2);
        System.out.println(arrayInt2.length);
        System.out.println(arrayInt.getClass().getCanonicalName());

//        char[] chars = {'p', 'a', 'o', 'l', 'o'};
//        System.out.println("array of chars : " +chars);
//        System.out.println("array of chars : " + new String(chars));
    }
}