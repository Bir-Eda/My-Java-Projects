package ocaquestionsvp;

public class Q17 {
    public static void main(String[] args) {
        int arr[][] = new int[2][4];

        arr[1] = new int[]{1, 3, 8, 0, 8, 56};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

//        for(int []a:arr){
//            for(int i:a){
//                System.out.print(i+"");

                System.out.println(arr[i][j]);
            }
        }

    }

}
