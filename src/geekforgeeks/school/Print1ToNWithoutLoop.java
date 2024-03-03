package geekforgeeks.school;

public class Print1ToNWithoutLoop {
    public static void main(String[] args) {
        (new Print1ToNWithoutLoop()).printNos(64);
    }

    public void printNos(int N) {
        if (N > 1) {
            printNos(N - 1);
            System.out.print(" " + N);
        } else {
            System.out.print(N);
        }
    }
}
