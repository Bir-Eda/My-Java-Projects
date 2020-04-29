package fourteenarraylistpackage;

import java.util.ArrayList;

public class TwoDimIntArrayFirst {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> myTwoDim=new ArrayList<>();
        int number=1;
        for(int i=0; i<2; i++){
            myTwoDim.add(new ArrayList<>());
            for(int j=0; j<5; j++){
                myTwoDim.get(i).add(number);
                number++;
            }
        }
        //System.out.println(myTwoDim);

        for(int i=0; i<myTwoDim.size(); i++){
            System.out.println(myTwoDim.get(i));
        }
        for(ArrayList<Integer> arr : myTwoDim){

            for(int numbers: arr){
                System.out.println(numbers);

            }
        }
        // while loop implementation
        int count=0;
        while(count<myTwoDim.size()){
            System.out.println(myTwoDim.get(count));
            count++;

        }
        // Nested while loop implementation
        int indexOuter=0;
        int indexInner;
        while(indexOuter<myTwoDim.size()){
            indexInner=0;

            while(indexInner<myTwoDim.get(indexOuter).size()){
                System.out.println(myTwoDim.get(indexOuter).get(indexInner));
                indexInner++;
            }
            indexOuter++;
        }
    }
}
