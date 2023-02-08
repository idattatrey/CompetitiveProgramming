package hackerearth.basic_programming.input_output.basics;

import java.util.Scanner;

public class FindProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        long answer = 1;
        for (int i = 0; i < n; i++) {
            answer = (long) ((answer * scanner.nextLong()) % (Math.pow(10, 9) + 7));
        }
        System.out.print(answer);
    }
}