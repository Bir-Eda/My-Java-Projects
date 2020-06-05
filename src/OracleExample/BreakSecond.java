package OracleExample;

import java.util.Scanner;

public class BreakSecond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            int operation = scan.nextInt();
            if (operation == -1) {
                System.out.println("Go out from loop");
                break;
            }
            System.out.println("operation :" + operation);
        }
    }
}
