package twentyjavastringprocessingrecursionpackage;

public class ThirdExample {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Orhan");
        System.out.println(str);
        str.setCharAt(0, 'E');
        System.out.println(str);
        System.out.println(str.codePointCount(0,4));
        System.out.println(str.codePointAt(3)); // a=97
    }
}
