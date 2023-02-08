package hackerearth.basic_programming.input_output.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = 1;
        if (n != 1) {
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
        }
        System.out.println(result);
    }
}
