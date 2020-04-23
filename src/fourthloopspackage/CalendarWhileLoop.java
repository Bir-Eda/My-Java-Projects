package fourthloopspackage;

public class CalendarWhileLoop {
    public static void main(String[] args) {
        int month=1;
        int day =1;

        while (month<=12) {
            day=1;
            while (day<=30) {
                System.out.println(month+"/"+ day +"/" + "2020");
                day++;
            }
            month++;
            if(day!=13)
                System.out.println("------------");
        }
    }
}
