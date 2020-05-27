package whizlabspackage;

public class Q5q2 {
    public static void main(String[] args) {
        int ar[][] = {{1, 0}, {-4}, {3, 1}};

        System.out.println(ar.length);
        f1:
        for (int[] a : ar) {
            for (int x = 0; x < a.length; x++) {
                if (a[x] < 0) break f1;
                System.out.print(a[x]);
            }
        }
    }
}
