package fourteenarraylistpackage;

import java.util.ArrayList;

public class ArrayListLoop {
    public static void main(String[] args) {
        ArrayList<Integer> myList=new ArrayList<Integer>();
        myList.add(8);
        myList.add(12);
        myList.add(39);
        // Regular for loop
        for(int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
        // For each Loop
        for(int element:myList){            // for(int i=0; i<myList.size(); i++){
            System.out.println(element);    // System.out.Println(myList.get(i));
        }
        // While
        int index=0;
        while(index<myList.size()){
            System.out.println(myList.get(index));
            index++;
        }
    }


}
