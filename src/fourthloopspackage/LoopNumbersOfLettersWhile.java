package fourthloopspackage;

public class LoopNumbersOfLettersWhile {
    public static void main(String[] args) {
        char letters = 'a';
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + "\t");
            for (int j = 0; j < 4; j++) {
                System.out.print("\t" + letters + "\t");
                letters++;


            }
            System.out.println();
        }

    }
}
