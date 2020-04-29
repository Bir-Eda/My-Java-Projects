package sixteeniteratorpackage;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDigitRepeatNumberVeryLargeNumber {
    public static void main(String[] args) {
        String number="12349675384";
        HashMap<String, Integer>num=new HashMap<>();
        String threeNum=number.substring(0, 3);
        num.put(threeNum, 1);
        for(int i=0; i<number.length()-2; i++){
            System.out.println(number.substring(i, i+3));
            threeNum=number.substring(i, i+3);
            if(num.containsKey(threeNum)){
                num.put(threeNum, num.get(threeNum)+1);
            }
            else{
                num.put(threeNum, 1);
            }
        }
        System.out.println(num);
        Iterator<String>iterator=num.keySet().iterator();
        String key;
        while(iterator.hasNext()){
            key = iterator.next();
            if(num.get(key)>1){
                System.out.println(key+" = "+num.get(key));
            }
        }

    }
}
