package finalreview;

public class Stringvalue {
    public static void main(String[] args) {
    total("abc");
    }
    public static void total(String value){
        int stValue=0;
        for(int i=0; i<value.length(); i++){
            stValue+=(int)value.charAt(i);
        }
        System.out.println(stValue);
    }
}
//    String a="0";
//    char b=a.charAt(0);
//        for(int i=0; i<a.length();i++){
//        b++;
//        System.out.println(i+b);
//        }