package twentyjavastringprocessingrecursionpackage;

import java.util.HashSet;

public class SlotMachineArrayListSecond {
    public static void main(String[] args) {
    String arr[]={"arr", "cerr", "ser"};
    String []arr2= {"gg", "gg"};
        System.out.println(isJackpot(arr));
        System.out.println(isJackpot(arr2));
    }
    public static boolean isJackpot(String [] str){
        HashSet<String> hs=new HashSet<>();
        boolean isJackpot=true;
        for(String word:str){
            hs.add(word);
        }
        System.out.println(hs);
        if(hs.size()==str.length){
            isJackpot=false;
        }
        return isJackpot;
    }
}
