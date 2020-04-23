package fourteenarraylistpackage;

import java.util.ArrayList;

public class TwoDimRandArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myTwoDim = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            myTwoDim.add(new ArrayList<>());
            for (int j = 0; j < 5; j++) {
                myTwoDim.get(i).add((int) (Math.random() * 100));
            }
        }
        for (ArrayList<Integer> row : myTwoDim) {
            for (int element : row) {
                System.out.print(element + "\t\t");
            }
            System.out.println();
            System.out.println("--------------------");
        }
       // multiplyByConstant();
    }
    public static void multiplyByConstant (ArrayList<ArrayList<Integer>> arr, int constant){
        for(ArrayList<Integer> row : arr){
            for(int value : row){
                System.out.println(value*constant+"\t\t");
            }
            System.out.println();
        }
    }

}


