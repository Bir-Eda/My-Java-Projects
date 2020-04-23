package fifthmethodpackage;

public class PyramidUpDown {
    public static void upPyramid() {
        for (int i = 1; i <= 7; i++) {
            for (int k = 10; k >= i; k--) {
                System.out.print(" ");
            }
            for (int m = 1; m <= i; m++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void downPyramid(){
        for( int i=1; i<=7; i++){
            for( int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int k=0; k<(2*4-i); k++ ){
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        upPyramid();
        downPyramid();
    }
}
