package homeworkpackage;

import java.util.Scanner;

public class SwitchGradeT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your grade :");
        double grade = scan.nextDouble();
        switch((int)(grade/10)){
            case 10:
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println("A");
                break;
            case 7:
                System.out.println("B");
                break;
            case 6:
                System.out.println("C");
                break;
            case 5:
                System.out.println("D");
                break;
            case 4: case 3: case 2: case 1:
                System.out.println("Fail");
                break;
            default:
                System.out.println("Please enter a valid grade");
                break;
        }

    }
}
