package firstdatatypepackage;
import java.util.Scanner;
public class ExpenseList {
    public static void main(String[] args) {
        System.out.println("What is your income?");
        Scanner x = new Scanner(System.in);
        float income = x.nextFloat();
        float rent = 1250.00f;
        int age = 45;
        float height = 76.34f;

        System.out.format("\t\t\t\t Summary \n");
        System.out.format("\t--------------------\n");
        System.out.format("\t Income \t: %.2f \n", income);
        System.out.format("\t Rent \t\t: %.2f \n", rent);
        System.out.format("\t Age \t: %d \n", age);
        System.out.format("\t Height \t: %.2f", height);

    }
}
