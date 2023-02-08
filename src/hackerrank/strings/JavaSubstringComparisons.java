package hackerrank.strings;

import java.util.Scanner;

public class JavaSubstringComparisons {

    public static String getSmallestAndLargest(String s, int k) {
        int stringLength = s.length();
        String smallest = s.substring(0, k);
        String largest = s.substring(stringLength - k, stringLength);
        String temp = "";

        for (int i = 0; i < s.length() - k + 1; i++) {
            temp = s.substring(i, i + k);
            if (temp.compareTo(largest) > 0) {
                largest = temp;
            } else if (temp.compareTo(smallest) < 0) {
                smallest = temp;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
