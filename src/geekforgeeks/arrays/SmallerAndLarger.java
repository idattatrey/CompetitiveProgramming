package geekforgeeks.arrays;

public class SmallerAndLarger {
    public static void main(String[] args) {
        int[] result = getMoreAndLess(new int[]{3, 3, 3}, 3, 3);
        System.out.println(result[0] + "" + result[1]);
    }

    public static int[] getMoreAndLess(int[] arr, int n, int x) {
        int[] result = new int[]{0, 0};
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                result[0]++;
                result[1]++;
            } else if (arr[i] <= x) {
                result[0]++;
            } else if (arr[i] >= x) {
                result[1]++;
            }
        }
        return result;
    }
}
