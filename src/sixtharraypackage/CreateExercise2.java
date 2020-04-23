package sixtharraypackage;

public class CreateExercise2 {
    public static void randomInt(int n) {
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 4000 + 1000);
            System.out.println(array[i]);

        }

    }
    public static void main(String[] args) {
        randomInt(9);
    }

}
