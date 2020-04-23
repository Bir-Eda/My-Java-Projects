package thirteenexceptionpackage;

public class ExceptionArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(arr[10]);
        } catch (ArithmeticException e) {    //  catch (NullPointerException e)
            System.out.println("ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Parent exception");
        }
        System.out.println("Code ...");
    }
}
