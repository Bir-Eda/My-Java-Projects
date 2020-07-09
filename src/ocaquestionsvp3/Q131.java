package ocaquestionsvp3;

import java.time.LocalDate;

public class Q131 {
    public static void main(String[] args) {
        LocalDate date= LocalDate.of(2012,01, 32);
        date=date.plusDays(10);  //  ?????? plus.Days  // date i hic birseye atamamis
        System.out.println(date);   // date=date.plusDays(10) olmaliydi

    }
}
