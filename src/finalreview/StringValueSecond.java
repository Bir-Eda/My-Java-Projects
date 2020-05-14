package finalreview;

public class StringValueSecond {
    public static void main(String[] args) {
        System.out.println(value("abc"));
    }
    public static int value(String word){
        int sum=0;
        for(int i=0; i<word.length(); i++){
            sum+=(int)word.charAt(i);
        }
        return sum;
    }
}
