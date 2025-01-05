package geekforgeeks.arrays;

import java.util.Arrays;

public class AverageInAStream {
    public static void main(String[] args) {
        float[] result = streamAvg(new int[]{10, 20, 30, 40, 50});
        System.out.println(Arrays.toString(result));
    }

    public static float[] streamAvg(int[] arr) {
        float[] result = new float[arr.length];
        float a = 1f;
        int defaultNo = 0;

        for (int i = 0; i < arr.length; i++) {
            defaultNo += arr[i];
            result[i] = defaultNo / a;
            a++;
        }

        return result;
    }
}
