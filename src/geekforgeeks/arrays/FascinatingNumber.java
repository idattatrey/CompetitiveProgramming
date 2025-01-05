package geekforgeeks.arrays;

import java.util.HashSet;

public class FascinatingNumber {
    public static void main(String[] args) {
        System.out.println(fascinating(819));
    }

    public static boolean fascinating(long n) {

        String result = String.valueOf(n);
        result = result + (n * 2) + (n * 3);
        System.out.println(result);
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < result.length(); i++) {
            if (result.charAt(i)!='0') {
                set.add(result.charAt(i));
                if (set.size() == 9) {
                    return true;
                }
            }
        }
        return false;
    }
}
