package finalreview;

public class StringException {
    public static void main(String[] args) throws Exception {
        StringBuilder a = new StringBuilder("abc");
        try {
            System.out.println(a.charAt(10));  //null pointer
            //this is unchecked exception
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        StringBuffer buffer=new StringBuffer("Java");
        buffer.append(new B(1, 2));
        System.out.println(buffer.charAt(5));
        System.out.println(buffer.substring(4).length());
        
    }
}
class B{
    int x;
    int y;
    public B(int x, int y){
        this.x=x;
        this.y=y;
    }
}