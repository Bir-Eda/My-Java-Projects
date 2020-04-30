package fifth_method_package;

public class TrySecondPyramid {
    public static void pyramid(){
        for(int i=1; i<=10; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("__________");
    }

    public static void upSideDownPyramid(){
        for(int i=1; i<=10; i++){
            for( int j=10; j>i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid();
        upSideDownPyramid();
    }
}
