package geekforgeeks.strings;

public class DisplayLongestName {
    public static void main(String[] args) {
        System.out.println(longest(3, new String[]{"DATTA", "DATT", "DATTATREY"}));
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
