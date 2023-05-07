package geekforgeeks.school;

import java.util.TreeSet;

public class SecondLargest {
    public static void main(String[] args) {
        System.out.println(print2largest(new int[]{28, 43, 26, 65, 60, 54, 51, 35, 42, 48, 33, 40, 58, 38, 64, 47, 44, 49, 46, 25, 57, 39, 55, 45, 29, 32, 61, 53, 31, 36, 56, 63, 30, 52, 27, 34, 50, 41, 37, 66, 62, 59}, 42));
    }

    static int print2largest(int arr[], int n) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= first) {
                first = arr[i];
            } else if (arr[i] < first && arr[i] >= second) {
                second = arr[i];
            }
        }
        return second;
    }
}
