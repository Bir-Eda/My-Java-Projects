package ocaquestionsvp2;

public class Q54 {
    public static void main(String[] args) {
        String[][] arr = {{"A", "B", "C","S"}, {"D", "E"}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j] + " ");
                if (arr[i][j].equals("A")) {
                    break;
                }
               // continue; ??????
            }
          //  continue;   ??????
        }

    }
}