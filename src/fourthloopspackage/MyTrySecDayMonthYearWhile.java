package fourthloopspackage;

public class MyTrySecDayMonthYearWhile {
    public static void main(String[] args) {
        int day=1;
        int month=1;
        do {
            do{
                System.out.println(month + "/" + day + "/" + "2020");
                day++;
            }
            while(day<=30);
            month++;
        }
        while(month<=12);
    }
}
