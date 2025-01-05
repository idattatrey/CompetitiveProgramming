package geekforgeeks.strings;

import java.util.ArrayList;
import java.util.Comparator;

public class SortaString {
    public static void main(String[] args) {
        System.out.println(sort("edcaab"));
    }

    public static String sort(String s) {
        ArrayList<Character> ci = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            ci.add(s.charAt(i));
        }
        ci.sort(Comparator.comparingInt(o -> o));
        return ci.toString().replaceAll(", ", "").replace("[", "").replace("]", "");
    }
}
