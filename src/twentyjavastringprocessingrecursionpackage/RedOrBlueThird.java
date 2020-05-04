package twentyjavastringprocessingrecursionpackage;

public class RedOrBlueThird {
    public static void main(String[] args) {
        System.out.println(seeColor("bluexxx"));
    }
    public static String seeColor(String str){
        return str.substring(0,3).equals("red") ? "red" : str.substring(0,4).equals("blue") ? "blue" : "";
    }
}

