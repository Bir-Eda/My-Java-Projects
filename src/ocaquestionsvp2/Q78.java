package ocaquestionsvp2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Q78 {
    public static void main(String[] args) {
       String date= LocalDate.parse("2014-05-04").format(DateTimeFormatter.ISO_DATE);  // yil, ay ve gun formati
        System.out.println(date);

    }
}
// parse sitringi int e cevirir
