package sixtharraypackage;

public class CommonSecond {
    public static void commonArray(int a[], int[] b) {
        for (int i = 0; i < a.length; i++) {
            //int counter=0;
            for (int k = 0; k < b.length; k++) {
                if (a[i] == b[k]) {
                    System.out.println(b[k]);  // sout icinde a[i] yi de yazdirabilirsin. ortak elemanlari alacagi icin farketmez
                }
            }
        }
    }
    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 3, 12};
        int[] array2 = {5, 7, 12, 4, 55, 23, 1, 67, 99};
        commonArray(array1, array2);

    } // rakamlarla oynayinca farkli sonuclar cikabilir
}

//implement that question with boolean



