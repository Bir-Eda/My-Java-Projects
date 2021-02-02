package twentyjavastringprocessingrecursionpackage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CenturySecond {
    public static void main(String[] args) {
        String num="1645";
        String num2="2000";



    }
    public static int findCentury(String num){
        String newS= ""+num.charAt(0)+num.charAt(1);
        int number=Integer.parseInt(newS);
        int century=number;
        if(num.charAt(2)>0){
            century+=1;
        }
        else{
            century=century;
        }
        return century;
    }


}
