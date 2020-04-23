package sixtharraypackage;

public class SumArray {
    public static void main(String[] args) {
        int sum=0;
        int []array={1,2,5,9,12};
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        System.out.println("Sum off all numbers: "+ sum);
        System.out.println("-------------");
       // int odd=0;
        int sumOff=0;
        for(int j=0; j<array.length; j++){
            if(array[j]%2==1){
                //sumOff+=array[j];
                System.out.println(array[j]+" ");
            }
            }
        System.out.print("Sum of odd numbers:"+ sumOff+"\n");

        for(int k=0; k<array.length; k++){
            if(array[k]%2==0){
                System.out.print(array[k]+" ");
            }
        }
    }
}
