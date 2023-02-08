package hackerearth.basic_programming.input_output.basics;

import java.util.Scanner;

public class SevenSegmentDisplay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int t = scanner.nextInt();
            if (t < 10) {
                System.out.println(findNumberOfMatchSticks(t));
            } else {
                int sum = 0;
                while (t != 0) {
                    sum += findNumberOfMatchSticks(t % 10);
                    t = t / 10;
                }
                System.out.println(sum);
            }
        }
    }

    private static int findNumberOfMatchSticks(int t) {
        if (t == 0 || t == 6 || t == 9) {
            return 6;
        } else if (t == 2 || t == 3 || t == 5) {
            return 5;
        } else if (t == 1) {
            return 2;
        } else if (t == 4) {
            return 4;
        } else if (t == 7) {
            return 3;
        }
        return 7;
    }

}
