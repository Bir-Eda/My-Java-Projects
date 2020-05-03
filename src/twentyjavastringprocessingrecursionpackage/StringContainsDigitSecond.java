package twentyjavastringprocessingrecursionpackage;

public class StringContainsDigitSecond {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("294846a");
        boolean result=false;
        int count=0;
        for(int i=0; i<str.length(); i++){
            if(!(str.codePointAt(i)>=48 && str.codePointAt(i)<=57)){
                count++;
            }
        }
        if(count==0){
            result=true;
        }
        System.out.println(result);
    }
}
