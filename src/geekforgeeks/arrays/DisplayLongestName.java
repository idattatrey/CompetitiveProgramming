package geekforgeeks.arrays;

public class DisplayLongestName {
    public static void main(String[] args) {

    }

    public static String longest(int n, String[] names) {
        String output = "";
        for (String s : names) {
            if (output.length() < s.length()) {
                output = s;
            }
        }
        return output;
    }
}
