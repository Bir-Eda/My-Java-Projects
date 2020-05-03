package twentyjavastringprocessingrecursionpackage;

public class ContentOfAnotherStringThird {
    public static void main(String[] args) {
        String str = "Java Rocks";
        String end_str = "ks";
        boolean ends = str.endsWith(end_str);
        System.out.println("\"" + str + "\" ends with " +
                "\"" + end_str + "\"? " + ends);

    }
}
