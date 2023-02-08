package hackerearth.basic_programming.input_output.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountDivisors {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = bufferedReader.readLine().split(" ");

        int l = Integer.parseInt(arr[0]);
        int r = Integer.parseInt(arr[1]);
        int k = Integer.parseInt(arr[2]);

        int c1;
        int c2;
        int result;
        if (l % k == 0) {
            c1 = l;
        } else {
            c1 = (l + k) - (l % k);
        }
        if (r % k == 0) {
            c2 = r;
        } else {
            c2 = r - (r % k);
        }
        result = (c2 / k) - (c1 / k) + 1;
        System.out.println(result);
    }
}
