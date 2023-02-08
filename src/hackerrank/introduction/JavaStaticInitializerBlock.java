package hackerrank.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {
    static int B = 0;
    static int H = 0;
    static boolean flag = false;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();

        try {
            if (B <= 0 || H <= 0) {
                throw new Exception("java.lang.Exception: Breadth and height must be positive");
            } else {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main
}