package hackerrank.strings;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int output = A.compareTo(B);
        System.out.println(A.length() + B.length());
        if (output > 0) System.out.println("Yes");
        if (output < 0 || output == 0) System.out.println("No");
        System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1).toUpperCase() + B.substring(1));
    }
}
