package twentyjavastringprocessingrecursionpackage;

import java.util.HashMap;

public class OrdinalNumberT {
    public static void main(String[] args) {
        System.out.println(returnOrdinal(3856));
    }
    public static String returnOrdinal(int number){
        HashMap<Character, String> hm=new HashMap<>();
        hm.put('1', "ST");
        hm.put('2', "ND");
        hm.put('3', "RD");
        hm.put('4', "TH");
      //  for (int i=4;i<10;i++) {
         //   hm.put((char) i, "th ");
     //   }
        String ordNumber=""+number;
        char last=ordNumber.charAt(ordNumber.length()-1);
        for(char key: hm.keySet()){
            if(key==last){
                ordNumber+="-"+hm.get(key);
            }
        }
        return ordNumber;
    }
}
