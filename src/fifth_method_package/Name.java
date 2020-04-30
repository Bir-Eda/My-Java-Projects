package fifth_method_package;

public class Name {
    public static void main(String[] args) {
        System.out.println("Heyy");

        printMyName();
        printMyName2("Yildirim");
        System.out.println(myLastName3());
        myLastName3();
        lastName4("Yildirim");
    }

    public static void printMyName() {
        System.out.println("Birsen");
    }

    public static void printMyName2(String name) {
        System.out.println(name);
    }

    public static String myLastName3() {
        //System.out.println("Yildirim");
        return ("Yildirim");
    }

    public static String lastName4(String name) {
        System.out.println(name);
        return name;
    }
}