package twentyjavastringprocessingrecursionpackage;

public class OrdinalNumber {
    public static void main(String[] args) {
        System.out.println(endLetter(553));
    }
    public static String endLetter(int n){
        switch (n%10) {
            case 1:
                return n+"-ST";
            case 2:
                return n+"-ND";
            case 3:
                return n+"-RD";
            case 4:
                return n+"-TH";
        }
        return n+"TH";
    }
}
