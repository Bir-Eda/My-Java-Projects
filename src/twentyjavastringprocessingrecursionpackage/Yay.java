package twentyjavastringprocessingrecursionpackage;

public class Yay {
    public static void main(String[] args) {
        System.out.println(yay("i", "Yay"));
    }

    public static String yay(String tag, String yay) {
        return ('<' + tag + '>' + yay + '<' + '/' + tag + '>');
    }
}