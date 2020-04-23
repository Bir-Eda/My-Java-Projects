package thirdifstatementpackage;

public class NestedIf {
    public static void main(String[]args){
        int x=1;
        int y=-4;

        if(x==1) {
            System.out.println("OK");
            if(y>0){
                System.out.println("Hello");
            }
            System.out.println("OK OK");
        }
    }
}
