package hackerrank.strings;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
        b = b.toLowerCase();

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char c = a.charAt(i);
                a = a.replaceFirst(String.valueOf(c), " ");
                b = b.replaceFirst(String.valueOf(c), " ");
            }
            a = a.trim();
            b = b.trim();
            return a.length() == b.length() && b.isEmpty();
        } else {
            return false;
        }
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
