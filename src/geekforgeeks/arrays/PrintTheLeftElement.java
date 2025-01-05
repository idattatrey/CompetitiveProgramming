package geekforgeeks.arrays;

import java.util.TreeSet;

public class PrintTheLeftElement {
    public static void main(String[] args) {
        long[] lng = new long[]{7, 8, 3, 4, 2, 9, 5};
        System.out.println(leftElement(lng, 7));
    }

    public static long leftElement(long arr[], long n) {
        if (n == 1) {
            return arr[0];
        }
        TreeSet<Long> tSet = new TreeSet<>();
        for (long l : arr) {
            tSet.add(l);
        }
        if (n == 2) {
            return arr[0];
        } else {
            if (n % 2 == 0) {
                long temp = ((n / 2) - 1);
                return arr[(int) temp];
            } else {
                long temp = (n / 2) + 1;
                return arr[(int) temp];
            }
        }
    }
}
