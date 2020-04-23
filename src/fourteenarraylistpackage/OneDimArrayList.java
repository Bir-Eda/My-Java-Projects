package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;
public class OneDimArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(4,3,7,6,9,12));
        int max;
        if(list.get(0)>list.get(list.size()-1)){
            max= list.get(0);
        }
        else{
            max=list.get(list.size()-1);
        }
        for (int i = 0; i < list.size() ; i++) {
            list.set(i,max);
        }
        System.out.println(list);
    }
}
