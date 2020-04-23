package fourteenarraylistpackage;

import java.util.ArrayList;
// write a java program to find the 1 st derivative of the int Array
public class DerivativeIntArrayListT {
    public static void main(String[] args) {
        int []array={23, 43, 21, 22, 55};
        System.out.println(findDerivative(array));

    }
    public static ArrayList<Integer> findDerivative (int []arr) throws ArrayIndexOutOfBoundsException{
        ArrayList<Integer> derivation = new ArrayList<>();
        try{
            for(int i=0; i<arr.length; i++){
                derivation.add(arr[i]-arr[i+1]);
        }
    }
        catch(ArrayIndexOutOfBoundsException e){

        }
        finally {
            {
                return derivation;
            }
        }
        }
}
