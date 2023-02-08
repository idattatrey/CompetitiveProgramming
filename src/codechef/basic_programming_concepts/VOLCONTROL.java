package codechef.basic_programming_concepts;

import java.util.Scanner;

public class VOLCONTROL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println(Math.abs(scanner.nextInt()-scanner.nextInt()));
        }
    }
}
