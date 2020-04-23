package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class IntArrayListSameDifferences {
    public static void main(String[] args) {
       int []number={2,4,6,8};
        //System.out.println(differences(number));
        //ArrayList<Integer> myObj=differences(number);
        System.out.println(differences(number));
    }

    public static ArrayList<Integer> differences(int []list) {
        ArrayList<Integer> myNew = new ArrayList<>();
        for(int i=0 ; i<list.length ; i++){
            for(int j=i+1 ; j<list.length ; j++){
                myNew.add(list[i]-list[j]);
            }
        }
        myNew=findDublicates(myNew);
        return myNew;
    }
    public static ArrayList<Integer> findDublicates(ArrayList<Integer>arr){
        ArrayList<Integer>dublicates=new ArrayList<>();
        for(int i=0; i<arr.size()-1; i++ ){
            for(int j=i+1; j<arr.size(); j++){
                if(arr.get(i).equals(arr.get(j))&&! dublicates.contains(arr.get(i))){
                    dublicates.add(i);
                 }
            }
        }
        return dublicates;
    }
}
