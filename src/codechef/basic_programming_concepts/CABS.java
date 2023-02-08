package codechef.basic_programming_concepts;

import java.util.Scanner;

public class CABS {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            if (a < b) {
                System.out.println("FIRST");
            } else if (a == b) {
                System.out.println("ANY");
            } else {
                System.out.println("SECOND");
            }
        }
    }
}
