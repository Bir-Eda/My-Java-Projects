package fourthloopspackage;

public class DoWhileForABC {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i);
            for (char x = 'a'; x <= 'd'; x++) {

                System.out.print("\t" + x + "\t");
            }
            System.out.println();


        }

    }
}
