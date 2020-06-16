package ocaquestionsvp;

public class Q36 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
       // if (str2.equals(str1.toLowerCase())) {
        if(str1.toLowerCase()==str2){
            System.out.println("Equal");
        } else {
            System.out.println("Not equals");
        }
    }
}
