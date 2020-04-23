package fourthloopspackage;

public class LoopUpperCase {
    public static void main(String[] args) {
        for (int i = 65; i<91; i++) {
            // (int i=65; i<91; i+2) yazarsak harfleri bir atlayarak yazar A,C,E, gibi
            System.out.println(""+(char)i + ",");
        }
    }
}
