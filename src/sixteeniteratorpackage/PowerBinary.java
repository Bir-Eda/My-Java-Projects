package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PowerBinary {
    public static void main(String[] args) {
        LinkedList<Integer> x = new LinkedList<Integer>(Arrays.asList(1,0,1));
        int decimal = 0;
        for(int i=x.size()-1; i>=0; i--){
            decimal+=Math.pow(2,i)*x.get(i);
        }
        System.out.println(decimal);
    }
}
