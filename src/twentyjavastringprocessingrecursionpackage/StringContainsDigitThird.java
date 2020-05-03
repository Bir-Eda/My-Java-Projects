package twentyjavastringprocessingrecursionpackage;

public class StringContainsDigitThird {
    public static void main(String[] args) {
        String str = "Java4";
        System.out.println(isNotNumber(str));
    }
    public static boolean isNotNumber(String str){
        StringBuilder strb=new StringBuilder(str);
        boolean x = true;
        for (int i=0;i<strb.length();i++){
            if (!((strb.charAt(i)>=65&&strb.charAt(i)<=90)||(strb.charAt(i)>='a'&&strb.charAt(i)<='z'))){
                x=false;
            }
        }
        return x;
    }
}
