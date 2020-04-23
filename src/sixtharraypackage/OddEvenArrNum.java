package sixtharraypackage;

public class OddEvenArrNum {
    public static void main(String[] args) {
        int count=0;
        int odd = 0;
        int total=0;
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
       /* for (int i = 0; i <= 12; i++) {      // bu kisim odd numberlari gosteriyor
            if (numbers[i] % 2 == 1) {
                System.out.println(numbers[i]);
            }
        }*/
        for(int k=0; k<numbers.length; k++) {
            if (numbers[k] % 2 == 1) {    //% 2!=0
                //System.out.println(numbers[k]);
                count++;
            }
        }
        System.out.println("Odd number:"+ count);
        /*System.out.println("\n");
        for(int i=0; i<numbers.length; i++){   // bu kisim even numberlari gosteriyor
            if (numbers[i] % 2==0){
                System.out.println(numbers[i]);
            }*/
    }
}
