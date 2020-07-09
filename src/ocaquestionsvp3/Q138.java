package ocaquestionsvp3;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q138 {
    public static void main(String[] args) {
        LocalDateTime dt=LocalDateTime.of(2014, 7, 31, 1,1);
       //LocalDateTime  time= dt.plusDays(30);
      //  time=dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
       // System.out.println(time.format(DateTimeFormatter.ISO_DATE));
    }
}
// LocalDate.of = Year, motnh, day
//LocalDateTime.of = Year, motnh, day, hour, minute