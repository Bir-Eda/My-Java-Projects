package fifteenlinkedllistHashMappackage;

import java.util.HashMap;

public class DigitRepeatNumberT {
    public static void main(String[] args) {
        // we tested retrieving
       /* String s="12345";
        String first=s.substring(0, 3);
        int num= Integer.parseInt(first);
        num++;
        System.out.println(num);
        */
        String test="123412345123456";
        findRepeat(test);
    }

    public static void findRepeat(String number) {
        String first=number.substring(0, 3);
        int number3=Integer.parseInt(first);
        HashMap<Integer, Integer>hm=new HashMap<>();
        hm.put(number3, 1);
        String other3;
        int numberOther3;
        for(int i=1; i< number.length()-2; i++){
            other3=number.substring(i, i+3);
            numberOther3=Integer.parseInt(other3);
            if(hm.containsKey(numberOther3)){
                hm.put(numberOther3, hm.get(numberOther3)+1);
            }
            else{
                hm.put(numberOther3, 1);
            }
        }
        //System.out.println(hm);
        for(int key: hm.keySet()){
            if(hm.get(key)>1){
                System.out.println("There are "+hm.get(key)+" "+key+" in the number");
            }
        }
    }
}