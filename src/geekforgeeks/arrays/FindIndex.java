package geekforgeeks.arrays;

import java.util.Arrays;

public class FindIndex {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(findIndex(new int[]{1, 2, 3, 4, 5, 5}, 6, 4)));
    }

    static int[] findIndex(int[] arr, int n, int key) {
        int[] result = new int[]{-1, -1};
        if (n == 1 && arr[0] == key) {
            result[0] = 0;
            result[1] = 0;
        }
        for (int i = 0; i < n; i++) {
            if (result[0] == -1 && arr[i] == key) {
                result[0] = i;
            }
            int lastIndex = n - i - 1;
            if (result[1] == -1 && arr[lastIndex] == key) {
                result[1] = lastIndex;
            }
            if (result[0] != -1 && result[1] != -1) {
                break;
            }
        }

        return result;
    }
}
