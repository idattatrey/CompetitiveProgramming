package geekforgeeks.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class StringReversal {
    public static void main(String[] args) {
        System.out.println(reverseString("GEEKS FOR GEEKS"));
    }

    public static String reverseString(String s) {
        s = s.replaceAll(" ", "");
        Set<Character> cH = new LinkedHashSet<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            cH.add(s.charAt(i));
        }
        return (cH.toString()).replaceAll(", ", "").replaceAll("\\[", "").replaceAll("]", "");
    }
}
