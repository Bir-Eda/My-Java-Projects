package Oracle;
import java.util.Scanner;
import java.lang.ArithmeticException;
public class ExceptionsClass {
    public static void main(String[] args) {
    //    int num1=4;
    //    int num2=0;
    //    System.out.println(num1/num2);
        String numStr ="123sdkfjg"; // run yapinca Exception verir
        int numInt=Integer.parseInt(numStr); //String bir ifadeyi integer a cevirir "123" run 123
        System.out.println(numInt);
    }
    private static int divide(int num1, int num2){
        return 0;
    }
}
