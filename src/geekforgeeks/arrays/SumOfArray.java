package geekforgeeks.arrays;

public class SumOfArray {
    public static void main(String[] args) {
        System.out.println(sum(new int[]{1, 2, 3, 4}, 4));
    }

    public static int sum(int[] arr, int n) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return sum;
    }
}
