package geekforgeeks.arrays;

import java.util.Arrays;

public class JavaArraysSet1 {
    public static void main(String[] args) {
        String result = average(new int[]{10, 20, 30, 40, 50}, 5);
        System.out.println(result);
    }

    private static String average(int A[], int N) {
        float sum = 0f;
        for (int i = 0; i < N; i++) {
            sum += A[i];
        }
        return ((int) sum + " " + String.format("%.2f", (sum / N)));
    }
}
