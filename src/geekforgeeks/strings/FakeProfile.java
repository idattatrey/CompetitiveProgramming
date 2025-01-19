package geekforgeeks.strings;

import java.util.HashSet;
import java.util.Set;

public class FakeProfile {
    public static void main(String[] args) {
        System.out.println(solve("jpmztf"));
    }

    public static String solve(String a) {
        String result = "HE!";
        String[] chars = new String[]{"a", "e", "i", "o", "u"};
        for (String aChar : chars) {
            a = a.replaceAll(aChar, "");
        }

        Set<Character> distinctChars = new HashSet<>();
        for (char ch : a.toCharArray()) {
            distinctChars.add(ch);
        }
        if (distinctChars.size() % 2 == 0) {
            result = "SHE!";
        }
        return result;
    }
}
