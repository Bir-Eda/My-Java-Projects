package firstdatatypepackage;
import java.util.Scanner;
public class Format {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("radius");
        double radius = scan.nextDouble();
        double circlePermeter= 2*(3.14*radius);
        System.out.println(circlePermeter);
    }
}