package projects;

public class PrimeNumbersT {
    public static void main(String[] args) {
        printPrimeNumbers(100);
    }

    public static void printPrimeNumbers(int limit) {
        int count;
        for (int i = 1; i <= limit; i++) {
            count = 0;
            for (int j = i; j >= 1; j--) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
            }
        }
        // Second solution
     /*public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i > 10) {
                if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0) {
                    System.out.println(i);
                }
            }
        }
    }*/
    }
}