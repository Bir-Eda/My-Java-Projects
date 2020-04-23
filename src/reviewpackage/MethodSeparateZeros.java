package reviewpackage;

import java.util.Arrays;

public class MethodSeparateZeros {
    public static void main(String[] args) {
        int number[] = {1, 0, 2, 0, 4, 0, 4, 5};
        int[] result = separateZeros(number);
        System.out.println(Arrays.toString(result));
    }

    public static int [] separateZeros(int[] arr) {
        int array[] = new int[arr.length];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            //for (int j = 0; j < arr.length; j++) {
                if (arr[i] != 0) {
                    array[index] = arr[i];
                    index++;

                }
            }
        return array;

        }

    }
