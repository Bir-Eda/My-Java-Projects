package twentyjavastringprocessingrecursionpackage;

public class NumberAsStringWithoutZeroT {
    public static void main(String[] args) {
        String num="0093805600000"; // aradaki sifiri yazmayacak
        System.out.println(deleteZeros(num));
    }
    public static String deleteZeros(String number){
        StringBuilder str=new StringBuilder();
        for(int i=0; i<number.length(); i++){
            if(number.charAt(i)!='0'){
                str.append(number.charAt(i));
            }
        }
        return str.toString();
    }
}
