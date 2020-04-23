package sixtharraypackage;

public class CreateArrRandomNumb {
    public static void main(String[] args) {
    buildRandomIntegerArray(5);
}

    public static void buildRandomIntegerArray(int a) {
        int[] x = new int[a];
        for (int i = 0; i < a; i++) {
            x[i] = (int) (Math.random() * 4000 + 1000);
            System.out.print(x[i] + ",");
            //if (i != a - 1) {
            //    }
        }
        // just to see the array elements
        for(int i=0; i<x.length; i++){
            System.out.println(x[i]);
        }

    }
}
