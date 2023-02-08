package hackerearth.basic_programming.input_output.basics;

import java.util.Scanner;

public class LifetheUniverseandEverything {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int temp = scanner.nextInt();
            if (temp == 42) {
                break;
            } else {
                System.out.println(temp);
            }
        }
    }
}
