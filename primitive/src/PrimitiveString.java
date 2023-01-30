public class PrimitiveString {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "world";
        System.out.println(s1.concat(" ").concat(s2));

        char[] c1 = {'a', 'b','c'};
        System.out.println("String.copyValueOf : ");
        System.out.println("Returns: a String that contains the characters of the character array. Equivalent to String(Chars[] variable)");
        System.out.println(String.copyValueOf(c1));
        System.out.println("-".repeat(40) );

        String s = "string";
        StringBuilder sb = new StringBuilder("string");

        System.out.println(s.equals(sb.toString()));
    }
}
