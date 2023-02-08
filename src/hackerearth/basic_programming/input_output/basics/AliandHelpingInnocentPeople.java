package hackerearth.basic_programming.input_output.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AliandHelpingInnocentPeople {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        boolean result = true;
        if (!(s.charAt(2) == 'A' || s.charAt(2) == 'E' || s.charAt(2) == 'I' || s.charAt(2) == 'O' || s.charAt(2) == 'U' || s.charAt(2) == 'Y')) {
            result = result && (Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1))) % 2 == 0;
            result = result && (Character.getNumericValue(s.charAt(3)) + Character.getNumericValue(s.charAt(4))) % 2 == 0;
            result = result && (Character.getNumericValue(s.charAt(4)) + Character.getNumericValue(s.charAt(5))) % 2 == 0;
            result = result && (Character.getNumericValue(s.charAt(7)) + Character.getNumericValue(s.charAt(8))) % 2 == 0;

            if (result) {
                System.out.print("valid");
            } else {
                System.out.print("invalid");
            }
        } else {
            System.out.print("invalid");
        }
    }
}
