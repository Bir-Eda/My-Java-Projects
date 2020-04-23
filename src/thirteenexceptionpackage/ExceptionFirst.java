package thirteenexceptionpackage;

public class ExceptionFirst {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try {
            arr[5] = 40 / 0;
        } catch (Exception e) {
            System.out.println("Exception handled");
/*
        } catch (ArithmeticException e) {
            System.out.println(" Arithmetic Exception handled");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException handled");
        }
        System.out.println("Codes");
    }*/
        }
    }
}