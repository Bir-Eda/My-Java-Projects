package fourthloopspackage;

public class Even2 {
    public static void main(String[] args) {
        for (int i = 2001; i >= 1000; i--) {
            // for (int i = 2000; i > 999; i-=2)
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

}
