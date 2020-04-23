package fifteenlinkedllistHashMappackage;

public class MultiplicationMax {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        maxMultiply(arr);
    }
        public static void maxMultiply(int[] arr){
            int max = 0;
            for (int i = 0; i < arr.length - 1; i++) {
                int x = arr[i] * arr[i + 1];
                if (x > max) {
                    max = x;
                }
                System.out.println("index " + i + "value" + arr[i]);
            }
            System.out.println("Max multiplication is " + max);
        }
    }

