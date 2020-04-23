package fourteenarraylistpackage;

import java.util.ArrayList;

public class ArrayListMaxMin {
    public static void main(String[] args) {
        ArrayList<Integer> myList= new ArrayList<Integer>();
        System.out.println();
        int medyan=myList.get(myList.size()/2);
        System.out.println("medyan:"+medyan);
        System.out.println("Smallest 3 elements:");
        for(int i=0; i<3;i++ ){
            System.out.print(myList.get(i)+"\t");
        }
        System.out.println();
        System.out.println("Largest 3 elements:");
        for(int i=myList.size()-1; i>(myList.size()-4);i-- ){
            System.out.print(myList.get(i)+"\t");
        }
    }
}
