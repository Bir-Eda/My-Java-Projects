package twentyjavastringprocessingrecursionpackage;

public class UpperCaseT {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("java");
        int letter;
        for (int i = 0 ; i < builder.length() ; i++){
            letter = builder.codePointAt(i); //get lowercase letter unicode number
            letter -= 32; //substract 32 to find uppercase unicode value
            builder.setCharAt(i,(char)letter);
        }
        System.out.println(builder);
    }
    }
