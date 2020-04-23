package eightsquarepackage;

public class ExerciseDoWhile {
    public static void main(String[] args) {
        int outer = 1;

        while (outer < 3) {

            int inner=5;
            while (inner<8){
                System.out.println("Outer loop: "+outer+" &"+" inner loop:"+inner);
                inner++;
            }
            outer++;

        }
    }
}
