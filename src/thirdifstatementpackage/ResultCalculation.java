package thirdifstatementpackage;

public class ResultCalculation {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 15;
        int num3 = 44;
        if (num1 > 20 || (num2 < num3 && (num1 + num3 > 0))) {
            System.out.println("inside if");
        } else {
            System.out.println("Not inside if");
        }
    }
}
