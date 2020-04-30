package fifth_method_package;

public class PrintCalendar {
    public static void calander() {
        for (int month = 1; month < 13; month++) {
            //sout("MONTH:"+month+"\n---------"); her ayin basina MONTH yazip numarasini da yazip altina cizgi ceker
            for (int day = 1; day <= 30; day++) {
                System.out.println(month + "/" + day + "/" + "2020");
            }
            System.out.println("-------------"); // if(month!=12){ sout("-------); en sona ikinci bir cizgi koymak icin yapilacak yontemlerden biri
        }
        System.out.println("-------------");

    }
    public static void main(String[] args) {
        calander();
    }

}
