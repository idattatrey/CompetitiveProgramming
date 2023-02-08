package hackerearth.basic_programming.input_output.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Divisibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String s = scanner.next();
            stringBuilder.append(s.substring(s.length() - 1));
        }
        BigInteger bigInteger = new BigInteger(String.valueOf(stringBuilder));
        BigInteger bigMod = new BigInteger("10");
        if (bigInteger.mod(bigMod) == BigInteger.ZERO) {
            System.out.print("Yes");
        } else {
            System.out.print("No");
        }
    }
}
