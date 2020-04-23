package fifthmethodpackage;

public class MultiplicationTable {
    public static void multiplication() {
        for(int i=1; i<10; i++){
            for(int j=1; j<10; j++){
                System.out.println(i+"x"+j+"="+(i*j));
            }






        /*for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.print((i * j) + "\t"); //(i+"x"+j+"=")
            }
            System.out.println();
*/
        }
    }

    public static void main(String[] args) {
        multiplication();
    }
}
