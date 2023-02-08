package hackerearth.basic_programming.input_output.basics;

import java.util.Scanner;

public class ToggleString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        for (int i = 0; i < s.length(); i++) {
            System.out.print(Character.isUpperCase(s.charAt(i)) ? Character.toLowerCase(s.charAt(i)) : Character.toUpperCase(s.charAt(i)));
        }
    }
}
