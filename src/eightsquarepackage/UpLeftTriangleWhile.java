package eightsquarepackage;

public class UpLeftTriangleWhile {
    public static void main(String[] args) {
        int a=1;
        int b;

        while(a<21){
            b=20;
            while (b>=a) {
                System.out.print("* ");
                b--;
            }
            System.out.println();
            a++;

        }
    }
}
