package reviewpackage;
import java.util.Scanner;
public class MethodDecideString {
    public static void main(String[] args) {
decision();
    }
    public static void decision() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you see? Sea or Mountain");
        String place = scan.next();
        System.out.println("Which Way? East, West, Midland, North ");
        String way = scan.next();
        if (place.equalsIgnoreCase("Sea")) {
            System.out.println("Have Fun");
            if (way.equalsIgnoreCase("East")) {
                System.out.println("Welcome to Florida");
            } else {
                System.out.println("Go to California");
            }
        } else {
            if (way.equalsIgnoreCase("Midland")) {
                System.out.println("Kansas");
            } else {
                System.out.println("Vermont");
            }


        }

    }
    }