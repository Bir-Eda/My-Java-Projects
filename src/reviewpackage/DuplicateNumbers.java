package reviewpackage;

public class DuplicateNumbers {
    public static void main(String[] args) {
        int arrr[] = {1, 2, 3, 4, 7, 2, 8, 3, 9};
        duplicate(arrr);
    }

    public static void duplicate(int[] array) {

        for (int i = 0; i < array.length-1; i++) {
                if (array[i]!=array[i+1]) {
                    System.out.println(array[i]+" ");
                }
            }
        }
}

