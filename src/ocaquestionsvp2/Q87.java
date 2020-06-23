package ocaquestionsvp2;

public class Q87 {
    public static void main(String[] args) {
        int[][] n = {{1, 3}, {2, 4}};
        for (int i = n.length - 1; i >= 0; i--) {
           // System.out.println(i);
           for (int j = n[1].length - 1; j >= 0; j--) {
                System.out.println(n[i][j]);
            }

        }
    }
}
