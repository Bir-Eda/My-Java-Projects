package eightsquarepackage;

public class Kahoot {
    public static void main(String[] args) {

        for (char i = 0, j = 6; i < 5 && j > 0; i++, --j) {
            System.out.print((int) i + "" + (int) j + ",");
        }
        System.out.println();

        boolean sentinel = true;
        while (sentinel) {
            System.out.print("A");
            sentinel = false;
        }


    }
}
