package thirteenexceptionpackage;

public class ExceptionExam {
    public static void main(String[] args) {

            int a[]= new int[5];
        try{
            a[5] =30/0;
            a[10]=10;
        }
        catch(ArithmeticException e){
            System.out.println("ArithmeticException occurs");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occurs");

        }
        catch(Exception e){
            System.out.println("Parent Exception occurs");
        }
        System.out.println("Rest of the code");


    }
}
