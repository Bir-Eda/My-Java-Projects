package codingbat;
import java.time.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Q9q16 {
    public static void main(String[] args) {
//    LocalDate date=LocalDate.of(2015,12,12);
//    LocalDateTime time= date.atTime(10,22);
//        System.out.println(date.getDayOfWeek()+">"+time.getHour()+":"+time.getMinute());


        Year y= Year.of(2015);
        LocalDate date=y.atMonthDay(MonthDay.of(4,8));
        System.out.println(date);
        System.out.println("--------------");
        List lst=new ArrayList(1);
        lst.add(1);
        lst.add("A");
        lst.add('A');
        lst.add(new Integer(5));  //depracate
        System.out.print(lst);
    }
}
