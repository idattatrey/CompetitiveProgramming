package geekforgeeks.arrays;

public class CountriesAtWar {
    public static void main(String[] args) {
        System.out.println(countryAtWar(new int[]{2, 2}, new int[]{5, 5}));
    }

    public static String countryAtWar(int[] arr1, int[] arr2) {
        String result = "DRAW";
        int A = 0, B = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                A++;
            }
            if (arr2[i] > arr1[i]) {
                B++;
            }
        }
        if (A == B) {
            return result;
        } else if (A > B) {
            result = "A";
        } else {
            result = "B";
        }
        return result;
    }
}
