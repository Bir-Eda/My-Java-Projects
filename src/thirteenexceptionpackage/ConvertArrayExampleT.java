package thirteenexceptionpackage;
import java.util.Arrays;
public class ConvertArrayExampleT {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7}, {8, 12}};
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row)); // to show how arrays.toString() works
        }
        System.out.println(Arrays.toString(arr));

        try {
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        finally {
        }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    try {
                        System.out.print(arr[j][i] + "\t");
                    } catch (ArrayIndexOutOfBoundsException e) {
                        System.out.print("Ooops");
                    }
                }

                System.out.println();
            }
        }
    }
