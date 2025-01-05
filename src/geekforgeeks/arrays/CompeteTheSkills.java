package geekforgeeks.arrays;

public class CompeteTheSkills {
    public static void main(String[] args) {
        long[] a = new long[]{4, 2, 7};
        long[] b = new long[]{5, 2,8};
        scores(a, b);
    }

    public static void scores(long[] a, long[] b) {
        int aSkills = 0;
        int bSkills = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > b[i]) {
                aSkills++;
            } else if (a[i] < b[i]) {
                bSkills++;
            }
        }
        System.out.print(aSkills + " " + bSkills);
    }
}
