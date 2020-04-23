package sixtharraypackage;

public class DimensionalArrRanInt {
    public static void main(String[] args) {

     /*   int arr[][]=new int [3][5];
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){
                arr[i][j]=(int)(Math.random()*9);
            }
        }
        for (int i=0; i<arr.length; i++){
            for (int number: arr[i]){
                System.out.print("\t"+number);
            }
            System.out.println();
        } */

        int arrayNumbers[][] = {{0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
        for(int i=0 ; i<arrayNumbers.length;i++){
            for(int j=0 ; j<arrayNumbers[i].length;j++){
                arrayNumbers[i][j] = (int)(Math.random()*1000);
            }
        }
        for(int numberArray[]:arrayNumbers){
            for(int number:numberArray){
                System.out.println(number);
            }
        }
        // Random String array
        String arrayWords[][] = new String[4][7];
        for (int i = 0; i < arrayWords.length; i++) {
            for (int k = 0; k < arrayWords[i].length; k++) {
               // arrayWords[i][k] =RanForEachLoopInt.generateRandomWord();
            }

        }
        for (String words[] : arrayWords) {
            for (String word : words) {
                System.out.format("\t%10s", word);
            }
            System.out.println();

        }

    }
}
