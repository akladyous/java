public class PrimitiveString {
    public static void main(String[] args) {
        String s1 = new String("hello");
        String s2 = "world";
        String s3;


        s3 = s1.concat(s2);
        System.out.println("String.concat s1.concat(s2): " + s3);

        char[] c1 = {'a', 'b','c'};
        System.out.println("String.copyValueOf : ");
        System.out.println("Returns: a String that contains the characters of the character array. Equivalent to String(Chars[] variable)");
        System.out.println(String.copyValueOf(c1));

        System.out.println("-".repeat(40) );

        String s = "string";
        StringBuilder sb = new StringBuilder("string");
        sb.append(" string2");
        System.out.println("StringBuilder.append : " + sb);
        System.out.println(s.equals(sb.toString()));
    }
}
