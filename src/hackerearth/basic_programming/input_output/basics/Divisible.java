package hackerearth.basic_programming.input_output.basics;

import java.math.BigInteger;
import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        StringBuilder stringBuilder = new StringBuilder();
        int left = n / 2;
        for (int i = 0; i < left; i++) {
            stringBuilder.append(scanner.next().charAt(0));
        }
        for (int i = left; i < n; i++) {
            String s = scanner.next();
            stringBuilder.append(s.substring(s.length() - 1));
        }
        BigInteger bigInteger = new BigInteger(String.valueOf(stringBuilder));
        BigInteger bigMod = new BigInteger("11");
        if (bigInteger.mod(bigMod) == BigInteger.ZERO) {
            System.out.print("OUI");
        } else {
            System.out.print("NON");
        }
    }
}
