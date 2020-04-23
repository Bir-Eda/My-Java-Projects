package thirteenexceptionpackage;

public class ExceptionExam2 {
    public static void main(String[] args) {
        int a[]= new int[5];
        try{
            a[5] =5/0;

    // Evaluate right hand side and assign value to the left hand side
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException ");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException ");

        }
        catch(Exception e){
            System.out.println("Parent Exception ");
        }
        System.out.println("Rest of the code");

    }
}
