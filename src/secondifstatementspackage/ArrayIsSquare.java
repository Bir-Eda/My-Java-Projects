package secondifstatementspackage;

public class ArrayIsSquare {
    public static boolean square(int array[][]) {
        boolean square=true;
        for (int i = 0; i < array.length; i++) {
            if (array.length != array[i].length) {
                return false; // square=false;
            }
        }
        return true; // or return square;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 3}, {2,4,3}};
        System.out.println(square(arr));
    }
}
