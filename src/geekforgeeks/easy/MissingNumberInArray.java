package geekforgeeks.easy;

import java.util.Scanner;

public class MissingNumberInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int sum = (N * (N + 1)) / 2;
        for (int i = 0; i < N - 1; i++) {
            sum -= scanner.nextInt();
        }
        System.out.println(sum);
    }

    int MissingNumber(int array[], int n) {
        int result = (n * (n + 1)) / 2;
        for (int i = 0; i < array.length; i++) {
            result -= array[i];
        }
        return result;
    }
}
