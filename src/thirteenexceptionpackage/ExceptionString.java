package thirteenexceptionpackage;

public class ExceptionString {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurs");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");

        } catch (Exception e) {
            System.out.println("Parent exception occurs");
        }
        System.out.println("rest of the code ...");
    }
}
