package finalreview;

public class OddIntegerSecond {
    public static void main(String[] args) {
        int arr[]={2,5,7,3,89,13};
        System.out.println(findOdd(arr));
    }
    public static int findOdd(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
            if (count % 2 != 0)
                return arr[i];
        }
        return -1;
    }
}