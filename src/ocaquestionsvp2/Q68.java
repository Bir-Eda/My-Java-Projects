package ocaquestionsvp2;

public class Q68 {
    public static void main(String[] args) {
        doSum(10, 20);  //int
        doSum(10.0, 20.0);  // double
    }
    public static void doSum(Integer x, Integer y){
        System.out.println("Integer :" +x+y);
    }
    public static void doSum(double x, double y){
        System.out.println( "doble :" +x+y);
    }
    public static void doSum(float x, float y){
        System.out.println( "float :" +x+y);
    }
    //public static void doSum(int x, int y){
     //   System.out.println("int :" +x+y);
   // }
}
