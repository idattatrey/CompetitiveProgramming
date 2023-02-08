package hackerearth.basic_programming.input_output.basics;

import java.util.Scanner;

public class RoyandProfilePicture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int w = scanner.nextInt();
            int h = scanner.nextInt();
            if (w < length || h < length) {
                System.out.println("UPLOAD ANOTHER");
            } else if (w >= length && h >= length) {
                if (w == h) {
                    System.out.println("ACCEPTED");
                } else {
                    System.out.println("CROP IT");
                }
            }
        }
    }
}
