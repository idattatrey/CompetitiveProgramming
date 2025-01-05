package geekforgeeks.arrays;

import java.util.ArrayList;

public class ValueEqualToIndexValue {
    public static void main(String[] args) {
        System.out.println(valueEqualToIndex(new int[]{15, 2, 45, 12, 7}, 5));
    }

    public static ArrayList<Integer> valueEqualToIndex(int[] arr, int n) {
        ArrayList<Integer> output = new ArrayList<>();
        for (int i = 0, couunter = 1; i < n; i++, couunter++) {
            if (arr[i] == couunter) {
                output.add(arr[i]);
            }
        }
        return output;
    }
}
