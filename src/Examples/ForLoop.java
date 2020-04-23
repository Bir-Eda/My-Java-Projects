package Examples;

public class ForLoop {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "\t");
            for (char j = 'a'; j <= 'y'; j++) {
                for (int k = j; k < 5; k++) {
                    System.out.print(j + "\t");

                }
                System.out.println();
            }
        }
    }
}
