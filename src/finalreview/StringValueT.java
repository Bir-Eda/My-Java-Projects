package finalreview;

public class StringValueT {
    public static void main(String[] args) {
        findTotalCharValues("abcd");
    }
    public static void findTotalCharValues(String str){
        int total=0;
        for(int i=0; i<str.length(); i++){
            total+=str.charAt(i);
        }
        System.out.println(total);
    }
}
