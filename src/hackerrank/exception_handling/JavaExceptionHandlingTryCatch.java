package hackerrank.exception_handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaExceptionHandlingTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = x / y;
            System.out.println(z);
        } catch (InputMismatchException exception) {
            System.out.println(exception.toString().split(":")[0]);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        }
    }
}
