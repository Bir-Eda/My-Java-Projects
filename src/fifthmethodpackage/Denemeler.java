package fifthmethodpackage;

public class Denemeler {
    public static void main(String[] args) {
        name1();
        name2("Birsen");
        System.out.println(name3());
        name4("Bir");
    }

    public static void name1() {
        System.out.println("Eda");
    }

    public static void name2(String word) {
        System.out.println(word);
    }

    public static String name3() {
        return ("Yildirim");
    }

    public static String name4(String first) {
        System.out.println(first);
        return first;
    }
}
