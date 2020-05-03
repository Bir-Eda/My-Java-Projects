package nineteenenumpackage;

public class WeekDayEnum {
    enum Day {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday,
    }



        public static void main (String[]args){
            for (Day days : Day.values()) {
                System.out.println(days);
            }
        }

    }
