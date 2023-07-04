package runnable;

import java.math.BigInteger;

public class ThreadInterruption2 {
    public static void main(String[] args) {
        Thread thread = new Thread(new LongComputationTask(new BigInteger("2"),new BigInteger("10")));
        thread.start();
    }


    private static class LongComputationTask implements Runnable {
        private BigInteger base;
        private BigInteger exponent;

        public LongComputationTask(BigInteger base, BigInteger exponent) {
            this.base = base;
            this.exponent = exponent;
        }
        @Override
        public void run() {
            System.out.println(base + "^" + exponent + " = " + power(base, exponent));
        }

        private BigInteger power(BigInteger base, BigInteger exponent) {
            BigInteger result = BigInteger.ONE;
            for (BigInteger i = BigInteger.ZERO; i.compareTo(exponent) != 0; i = i.add(BigInteger.ONE)) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("Prematurely interrupted computation");
                    return BigInteger.ZERO;
                }
                result = result.multiply(base);
            }
            return result;
        }
    }
}
