package sixtharraypackage;

public class CommonElements {
    public static void common(int a[], int b[]) {
        for (int i = 0; i < a.length; i++) {
            for (int s = 0; s < b.length; s++) {
                if (a[i] == b[s]) {
                    System.out.println(a[i]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 67, 4, 5, 6, 7, 8, 9};
        int arr2[] = {5, 7, 12, 9, 4, 55, 67, 18};
        common(arr1, arr2 );
    }
}
