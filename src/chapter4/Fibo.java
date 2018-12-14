package chapter4;

import java.math.BigInteger;

public class Fibo {
    public static void main(String args[]) {
        System.out.println(fibo(10));
    }
    public static String fibo(int limit) {
        switch(limit) {
            case 0:
                return "0";
            case 1:
                return "0, 1";
            case 2:
                return "0, 1, 1";
            default:
                BigInteger fibo1 = BigInteger.ONE;
                BigInteger fibo2 = BigInteger.ONE;
                BigInteger fibonacci;
                StringBuilder builder = new StringBuilder("0, 1, 1");
                for (int i = 3; i <= limit; i++) {
                    fibonacci = fibo1.add(fibo2);
                    builder.append(", ").append(fibonacci);
                    fibo1 = fibo2;
                    fibo2 = fibonacci;
                }
                return builder.toString();
        }
    }
}
