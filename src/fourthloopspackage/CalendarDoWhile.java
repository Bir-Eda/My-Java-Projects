package fourthloopspackage;

public class CalendarDoWhile {
    public static void main(String[] args) {
        int month = 1;
        int day = 1;
        do {
            do {
                System.out.println(month + "/" + day + "/" + "2020");
                day++;
            }
            while (day < 32);
            month++;
        }
        while (month < 13);
    }
}
