package thirdifstatementpackage;

public class JavaPointT {
    public static void main(String[] args) {
        int age = 28;
        int javaScore = 75;
        if ((age >= 20 && age <= 30) && javaScore >= 80) {
            System.out.println((age * 1.5) + (javaScore * 4.5));
        } else if ((age >= 20 && age <= 30) && javaScore < 80) {
            System.out.println((age * 1.5) + (javaScore * 3.5));
        } else if ((age > 30 && javaScore >= 80)) {
            System.out.println((age * 1.1) + (javaScore * 1.5));
        } else if (age > 30 && javaScore < 80) {
            System.out.println();
        } else {
            System.out.println("Please enter a valid age or java Score");
        }
    }

}
