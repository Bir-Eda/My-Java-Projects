package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Deneme3 {
    public static void main(String[] args) {
        ArrayList<String> myObj=new ArrayList<>(Arrays.asList("dhi","kal","esi","sgd"));
        System.out.println(removeString(myObj));
    }
    public static ArrayList<String> removeString(ArrayList<String>arr){
        ArrayList<String> myArray=new ArrayList<>();
        for(int i=0; i<arr.size(); i++ ){
            if(!(arr.get(i).contains("a")||arr.get(i).contains("e")||arr.get(i).contains("i"))){
                myArray.add(arr.get(i));
            }
        }
        return myArray;
    }
}
