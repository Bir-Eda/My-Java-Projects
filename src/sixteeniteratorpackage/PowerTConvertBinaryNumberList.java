package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class PowerTConvertBinaryNumberList {
    public static void main(String[] args) {
        List<Integer>pow=new LinkedList<>(Arrays.asList(1,0,0,0,1));
        System.out.println(convertToDecimal(pow));


        //for(int i=0; i<10; i++){
            //System.out.println("2 to the power "+i);
            //pows.add((int)Math.pow(2, i));

        //System.out.println(pows);
    }
    public static int convertToDecimal(List<Integer> nums){
        int result=0;
        List<Integer> powers= new ArrayList<>();
        for(int i=nums.size()-1; i>=0;  i--){
            powers.add((int)Math.pow(2, 1));
        }
        System.out.println(nums);
        System.out.println(powers);
        for(int i=0; i<nums.size(); i++){
            result+= nums.get(i)*powers.get(i);
        }

        return result;
    }
}
