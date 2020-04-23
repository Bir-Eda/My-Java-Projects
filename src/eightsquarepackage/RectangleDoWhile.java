package eightsquarepackage;

public class RectangleDoWhile {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        do {
            do {
                System.out.print("* ");
                j++;
            }
            while (j < 15);
            j=0;
            i++;
            System.out.println("  ");
        }
        while (i < 8);
    }
}
