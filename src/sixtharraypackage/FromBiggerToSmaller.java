package sixtharraypackage;

public class FromBiggerToSmaller {
    public static void main(String[] args) {

        int arr[] = {3, 5, 8, 2, 34, 78};
        int temp;
        int arrLen []= new int[arr.length];
        for(int i=0; i<arr.length; i++){ //arr arayinin tum elemanlarini ziyaret et
            for(int j=i+1; j<arr.length; j++ ){
                if(arr[i]<arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

                }
            System.out.print(arr[i]+" ");

            }


        }

    }

