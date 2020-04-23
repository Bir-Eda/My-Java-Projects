package reviewpackage;
import java.util.Arrays;
public class DuplicateNumbersT {
    public static void main(String[] args) {
        int myArray[]={1,2,3,6,8,3,67,7,2};
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }
    public static boolean isItInArray(int value, int[]arr){
        boolean result=false;
        for(int number:arr){
            if(number==value){
                result= true;
            }
        }
        return result;
    }
    public static int[] removeDuplicates(int []arr){
        int[]removeDup= new int[arr.length];
           for(int i=0; i<arr.length; i++){
            if(!isItInArray(arr[i],removeDup)){
                removeDup[i]=arr[i];
            }
        }
        return removeDup;
           // yukaridaki kisim  yerine for each loop da yazilabilir
           //int [] removeDup= new int[arr.length];
        //int index=0;
        //for(int element:arr){
        //if(!isItInArray(element, removeDup)){
        //removeDup[index]=element;
        //index++;
    }
}
