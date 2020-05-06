package eighteenrecursionpackage;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int arr[]={8391684};
        bubbleSort(arr);
    }
    static void bubbleSort(int[] array){
        int temp=0;
        for(int i=0; i<array.length; i++){

            for(int j=0; j<array.length; j++){
                System.out.println(array[j-1]+ array[j]);
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                    System.out.println(array[j]+ array[j-1]);
                    bubbleSort(array);
                }
            }
        }
    }
}
