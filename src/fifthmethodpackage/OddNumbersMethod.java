package fifthmethodpackage;

public class OddNumbersMethod {
    public static void oddNumber(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 == 1) {
                System.out.println(i+" ");
            }
        }
    }
    /*public static void oddNumbers(int start, int end){

        for(int i=start; i<end; i++){
            if(i%2==1){
            System.out.println(i);
        }
    }
}*/
    public static void evenNUmber(int start, int end) {
        for (int i = start; i < end; i++) {
            if (i % 2 == 0) {
                System.out.print(i+" ");
            }
        }
    }


    /*public static void main(String[] args) {
        //oddNumbers(13,21);
        evenNUmber.
        System.out.print("--------");
        oddNumber(13,21);
        */
}
