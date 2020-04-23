package eightsquarepackage;

public class TriangleExercise {
    public static void main(String[] args) {
        /*for (int i = 1; i <=16; i++) {
            for (int j = 1; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//---------------------------------------
        int i = 1;
        int j;
        while (i <= 16) {
            j = 0;
            while (j < i) {
                System.out.print("*  ");
                j++;
            }
            System.out.println();
            i++;
        }*/
        int i=0;
        int j;
        do{
            j=0;
            do{
                System.out.print("* ");
                j++;
            }while(j<=i);
            System.out.println();
            i++;
        }while(i<17);

    }
}
