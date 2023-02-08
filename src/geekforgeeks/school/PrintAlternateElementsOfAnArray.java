package geekforgeeks.school;

public class PrintAlternateElementsOfAnArray {
    public static void main(String[] args) {
        print(new int[]{1, 2, 3, 4}, 4);
    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n; i += 2) {
            System.out.print(arr[i] + " ");
        }
    }
}
