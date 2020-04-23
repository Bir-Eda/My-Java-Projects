package eightsquarepackage;

public class SquareExercise {
    public static void main(String[] args) {
        //Square forloop
        /*for (int i = 0; i < 10; i++) {
            for (int j = 1; j < 11; j++) {
                System.out.print("*  ");
            }
            System.out.println();
// Square while loop
        int i = 0;
        int j;
        while (i < 10) {

        j = 1;
        while (j < 11) {
            System.out.print("*  ");
            j++;
        }
            System.out.println();
            i++;*/
        // Square do while loop
        int i = 0;
        int j;
        do {
            j=0;
            do {
                System.out.print("*  ");
                j++;
            }
            while(j<10);
            System.out.println();
            i++;
        }
        while(i<10);
    }
}
