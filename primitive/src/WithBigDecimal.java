import java.math.BigDecimal;

public class WithBigDecimal {
    public static void main(String[] args) {
        double value = .012;
        double primitiveSum = value + value + value;
        System.out.println("Primitive sum of double : " + primitiveSum);

        String valueString = Double.toString(value);
        BigDecimal bigDecimalValue = new BigDecimal(valueString);
        BigDecimal bigDecimalSum = bigDecimalValue.add(bigDecimalValue).add(bigDecimalValue);

        System.out.println("BigSum sum of bigSum : " +bigDecimalSum);
    }
}
