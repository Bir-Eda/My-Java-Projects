package twentyjavastringprocessingrecursionpackage;

public class PasswordCreateThird {
    public static void main(String[] args) {
        String input = "sdafawef3q45tg)*U";
        if(length(input)&&isDigit(input)&&isUpperCase(input)&&isLowerCase(input)&&isSpecialCase(input)){
            System.out.println("Strong Password");
        }
        else{
            System.out.println("Weak Password");
        }
    }
    public static boolean length(String str){
        return str.length()<6?true:false;
    }
    public static boolean isDigit(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isDigit(str.charAt(i))){
                x=true;
            }
        }
        System.out.println(x);
        return x;
    }
    public static boolean isLowerCase(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isLowerCase(str.charAt(i))){
                x=true;
            }
        }
        System.out.println(x);
        return x;
    }
    public static boolean isUpperCase(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (Character.isUpperCase(str.charAt(i))){
                x=true;
            }
        }
        System.out.println(x);
        return x;
    }
    public static boolean isSpecialCase(String str){
        boolean x=false;
        for (int i = 0; i <str.length() ; i++) {
            if (!(Character.isDigit(str.charAt(i)))&&(!Character.isUpperCase(str.charAt(i)))&&(!Character.isLowerCase(str.charAt(i)))){
                x=true;
            }
        }
        System.out.println(x);
        return x;
    }
}
