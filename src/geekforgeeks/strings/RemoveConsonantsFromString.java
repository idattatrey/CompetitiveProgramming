package geekforgeeks.strings;

import java.util.List;

public class RemoveConsonantsFromString {
    public static void main(String[] args) {
        System.out.println(removeConsonants("DATTATREY"));
    }

    public static String removeConsonants(String s) {
        List<Character> characters = List.of('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u');
        StringBuilder sBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (characters.contains(s.charAt(i))) {
                sBuilder.append(s.charAt(i));
            }
        }
        if (sBuilder.toString().isEmpty()) {
            return "No Vowel";
        } else {
            return sBuilder.toString();
        }

    }
}
