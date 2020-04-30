package fifth_method_package;

public class Deneme {
    public static void numberASCII() {
        for (int i = 1; i < 256; i++) {
            System.out.println((char) i);
        }
    }

    public static int multi(int x, int y) {
        int number = x + y;
        System.out.println(number);
        return number;
    }

    public static void oddNumbers(int x, int y) {
        for (int i = x; i < y; i++) {
            if(i%2==1)
                System.out.println(i);

        }
    }

    public static void main(String[] args) {
        numberASCII();
        multi(45, 21);
        oddNumbers(11, 21);

    }
}
