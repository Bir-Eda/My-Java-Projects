package Oracle;

public class IfElseShortCut {
    public static void main(java.lang.String[] args) {
        int x = 10;
        int y;
        if (x > 3) {

            if (x < 1) {
                y=++x;
            } else {
                y = x--;
            }
        }
        else{
            y = 5;


        }

        System.out.println(y);
    }
}
