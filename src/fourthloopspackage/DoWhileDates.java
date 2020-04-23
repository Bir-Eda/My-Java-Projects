package fourthloopspackage;

public class DoWhileDates {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 31; j++) {
                System.out.format("%d/%d/2020\n", i, j);

            }
            System.out.println("------------------------");
        }
        int month = 1;
        do {
            for (int gun = 1; gun < 31; gun++) {
                System.out.println(month+("/"+gun+"/"+2020));
            }
            month++;
        }
        while(month<13);

    }
}
