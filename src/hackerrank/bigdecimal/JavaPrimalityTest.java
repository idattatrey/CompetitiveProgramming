package hackerrank.bigdecimal;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger input = scanner.nextBigInteger();
        if (input.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        scanner.close();
    }
}
