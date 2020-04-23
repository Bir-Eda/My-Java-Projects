package eightsquarepackage;

public class HourGlassFor {
    public static void main(String[] args) {
        // variable for the number of lines
        //int lines=9;    ikinci i ve ikinci k ya lines degeri vermek gerekir
        // i<11 yerine i<lines ve k<11 yerine k<11 gibi
        for (int i = 1; i < 11; i++) {
            //for space
            for (int j = 1; j <=i; j++) {
                System.out.print("-");

            }
            // to print numbers triangle
            for (int k =i; k <11; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }

    }
}
