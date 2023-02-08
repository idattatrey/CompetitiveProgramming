package hackerearth.basic_programming.input_output.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromicString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringBuilder buffer = new StringBuilder(s);
        if (s.equals(buffer.reverse().toString())){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
