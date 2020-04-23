package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;
public class DerivativeIntArrayListSecond {
    public static void main(String[] args) {
        ArrayList<Integer> obj = new ArrayList<Integer>(Arrays.asList(4, 6, 9, 2));
        derivate(obj);

    }
    public static void derivate(ArrayList<Integer>list){
        ArrayList<Integer>sumElement = new ArrayList<>();
        int elemnt;
        for (int i = 0; i <list.size()-1 ; i++) {
            elemnt=list.get(i)-list.get(i+1);
            sumElement.add(elemnt);
        }
        System.out.println(sumElement);
    }

}

