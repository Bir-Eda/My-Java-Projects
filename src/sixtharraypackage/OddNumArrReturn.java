package sixtharraypackage;

public class OddNumArrReturn {
    public static void main(String[] args) {
        int[]numbers={1,2,3,4,5,6,7,8,9,10,11,12};
        int sum=0;   // sum or total are the same meaning
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2==1){
                sum=sum+numbers[i];
            }
        }
        System.out.println("Sum of off numbers ;"+sum);

        int counter=0;   // counter means; how many are there odd numbers?
        for(int i=0; i<numbers.length; i++){
            if(numbers[i]%2!=0){
                counter++;
            }
        }
        System.out.println("Total number of odd numbers :"+counter);
    }
}
