package twentyjavastringprocessingrecursionpackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatter {
    public static void main(String[] args) {
//        String date = "2019-03-23";
//        LocalDate localDate = LocalDate.parse(date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-MMM-yyyy");
        String date = "22-Nov-2020";
        LocalDate localDate = LocalDate.parse(date, formatter);
        System.out.println(localDate);
    }
}
