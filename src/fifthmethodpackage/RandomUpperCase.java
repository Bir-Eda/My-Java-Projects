package fifthmethodpackage;

public class RandomUpperCase {
    public static void randomUpper() {
        for (int i = 1; i <= 2; i++) {
            System.out.print((char) (65 + (int) (Math.random() * 26)));
        }
    }
    public static void randomNumber() {
        for (int i = 1; i <= 4; i++) {
            System.out.print((int) (Math.random() * 10));
        }
    }
    public static void randomLetter() {

        for (int i = 1; i <= 3; i++) {
            System.out.print((char) (97 + (int) (Math.random() * 26)));

        }
    }
    public static void main(String[] args) {
        randomUpper();
        randomNumber();
        randomLetter();
    }
}
