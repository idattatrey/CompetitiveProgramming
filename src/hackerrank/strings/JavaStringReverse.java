package hackerrank.strings;

import java.util.Scanner;

public class JavaStringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(A);
        if (A.equals(stringBuilder.reverse().toString())) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
