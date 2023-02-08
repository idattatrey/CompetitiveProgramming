package hackerrank.introduction;

import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDate;

class Result {

    public static String findDay(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.name();
    }

}

public class JavaDateandTime {
    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
//
//        int month = Integer.parseInt(firstMultipleInput[0]);
//        int day = Integer.parseInt(firstMultipleInput[1]);
//        int year = Integer.parseInt(firstMultipleInput[2]);

//        String res = Result.findDay(month, day, year);
        String res = Result.findDay(8, 05, 2015);
        System.out.println(res);
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
