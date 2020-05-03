package twentyjavastringprocessingrecursionpackage;

public class UpperCaseThird {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("java");
        StringBuilder str2= new StringBuilder("");
        System.out.println(str);
        str.replace(0,4,"JAVA");
        System.out.println(str);
        for( int i=0; i<str.length()-1; i++){
            str2.insert(i,((char)(str.charAt(i)-32)));
        }
        System.out.println(str);
    }
}
