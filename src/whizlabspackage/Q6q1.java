package whizlabspackage;

public class Q6q1 {
    public static void main(String[] args) {
        Integer in=10;
        System.out.println(method(in));
    }
    private static String method(Object c){  // Object sayilarin atasi> Number > data type Integer, Byte, Short
        return c.toString();
    }
}
//public yada private olmasi onemli degil