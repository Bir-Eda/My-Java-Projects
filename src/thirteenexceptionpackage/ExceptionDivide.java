package thirteenexceptionpackage;
import java.util.Scanner;
public class ExceptionDivide {
    public static void main(String[] args) {
        divide();
    }
    public static void divide(){
        Scanner scan= new Scanner (System.in);
        System.out.println("please write first number");
        int first=scan.nextInt();
        System.out.println("please write second number");
        int second=scan.nextInt();
        try {

            System.out.println(first/second);

        } catch (ArithmeticException e) {
            System.out.println("Sorry I can not divide Zero\n Please try again");
        }
    }
}
