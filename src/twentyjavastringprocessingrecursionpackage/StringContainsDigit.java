package twentyjavastringprocessingrecursionpackage;

public class StringContainsDigit {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder("01268474654");
        System.out.println(builder.codePointAt(6));


        }
        public static boolean isAllDigits(StringBuilder str){
        boolean result=true;
            for (int i = 0; i < str.length(); i++) {
                if(!(str.codePointAt(i)>=48 && str.codePointAt(i)<=57)){
                    result=false;
                }
        }
            return result;
    }
}
