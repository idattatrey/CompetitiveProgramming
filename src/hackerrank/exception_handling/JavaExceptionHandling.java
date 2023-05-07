package hackerrank.exception_handling;

import java.util.Scanner;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            try {
                int x = sc.nextInt();
                int y = sc.nextInt();
                if (x == 0 && y == 0) {
                    throw new Exception("n and p should not be zero.");
                } else if (x < 0 || y < 0) {
                    throw new Exception("n or p should not be negative.");
                } else {
                    System.out.println(power(x, y));
                }
            } catch (Exception exception) {
                System.out.println(exception);
            }
        }
    }

    public static long power(int a, int b) {
        return (long) Math.pow(a, b);
    }
}
