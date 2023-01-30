public class PrimitiveBoolean {
    public static void main(String[] args) {
        String str = "true";

        boolean b1 = true;
        if (b1) {
            System.out.println("value is true");
        } else {
            System.out.println("value is false");
        }
        System.out.println("Boolean.valueOf() is not null : " + Boolean.valueOf(str));
        System.out.println("Boolean.parse(string value)   : " + Boolean.parseBoolean(str));
        System.out.println("Boolean.compare               : " + Boolean.compare(true, false));
        System.out.println("Boolean.logicalAnd            : " + Boolean.logicalAnd(true, true));
        System.out.println("Boolean.getBoolean            : " + Boolean.getBoolean(str));
    }
}
