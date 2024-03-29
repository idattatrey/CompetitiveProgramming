package hackerrank.object_oriented_programming;

import java.util.Scanner;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook {
    private String title = "";

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}

public class JavaAbstractClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        MyBook new_novel = new MyBook();
        new_novel.setTitle(title);
        System.out.println("The title is: " + new_novel.getTitle());
        sc.close();
    }
}
