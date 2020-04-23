package sixtharraypackage;

public class Deneme {
    public static void randomDimenArray() {
        int randomArr[][] = new int[6][4];

        for (int i = 0; i < randomArr.length; i++) {
            for (int k = 0; k < randomArr[i].length; k++) {
                randomArr[i][k] = (int) (Math.random() * 9 + 1);
                System.out.print(randomArr[i][k]);

            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        randomDimenArray();
    }

}
