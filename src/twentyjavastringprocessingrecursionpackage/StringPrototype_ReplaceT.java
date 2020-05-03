package twentyjavastringprocessingrecursionpackage;

public class StringPrototype_ReplaceT {
    public static void main(String[] args) {
        StringBuilder myBuilder = new StringBuilder(50);
        myBuilder.append(("apples and bananas").replace('a', 'u'));
        System.out.println(myBuilder);
    }
    }

