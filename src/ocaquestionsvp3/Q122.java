package ocaquestionsvp3;

import java.time.LocalDate;

public class Q122 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2012, 1, 30);
        date=date.plusDays(10);  // plusDays mean long days add LocalDate date1=date.plusDays(10) 10 gun ekleyecekti
        System.out.println(date);
    }
}
