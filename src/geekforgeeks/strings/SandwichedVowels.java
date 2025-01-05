package geekforgeeks.strings;

public class SandwichedVowels {
    public static void main(String[] args) {
        System.out.println(Sandwiched_Vowel("hqyisjastsjxpuoscndtxvifoamcxabtbqnwfkxmbtrrqfb"));
    }

    public static String Sandwiched_Vowel(String str) {
        String[] vowels = new String[]{"A", "E", "I", "O", "U", "a", "e", "i", "o", "u"};
        for (String vowel : vowels) {
            str = str.replaceAll(vowel, "*");
        }
        
        return str;
    }
}
