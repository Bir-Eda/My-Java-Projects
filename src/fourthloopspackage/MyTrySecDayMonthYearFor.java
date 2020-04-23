package fourthloopspackage;

public class MyTrySecDayMonthYearFor {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 30; j++) {
                System.out.println(i+"/"+j+ "/"+"2020");
            }
            if(i!=12) {
                System.out.println("-------");


            }
            System.out.println("-----------");
        }
    }
}
