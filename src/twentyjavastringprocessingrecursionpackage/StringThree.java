package twentyjavastringprocessingrecursionpackage;

public class StringThree {
    public static void main(String[] args) {
        StringBuilder myString= new StringBuilder();
        myString.append("java");
        myString.append(" is");
        myString.append(" fun");
        System.out.println(myString);
        myString.insert(7," super");
        System.out.println(myString);
        myString.replace(14,17,"strong");

        System.out.println(myString);
        myString.delete(0, 5);
        System.out.println(myString);
    }
    }

