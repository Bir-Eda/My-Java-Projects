package fourthloopspackage;

public class HelloOuter {
    public static void main(String[] args) {
        for (int i = 0; i < 1; i++) {
            System.out.print("Hello ");

            for (int j = 0; j < 3; j++) {


                System.out.print("World ");
            }
        }
    }
}
