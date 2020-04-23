package thirteenexceptionpackage;

public class Exception2 {
    public static void main(String[] args) {
        try{
            int data =50/1; //if you divide 50/0 you will see AritheticException.main(AritheticException.java:25)

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
        System.out.println("Rest of the code");
//
        try{
            int c=4/0;
        }
        catch(ArrayIndexOutOfBoundsException e){ // RunTimeException
            System.out.println(e);
        }
        System.out.println("Code");
    }
}
