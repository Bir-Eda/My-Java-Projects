package whizlabspackage;

public class Q7q16 {
     static int i;  // if is static just print AA
    public static void main (String[]args){
        Q7q16 wi1 = new Q7q16();
        Q7q16 wi2 = new Q7q16();
        Q7q16 wi3 = new Q7q16();
        Q7q16 wi4 = new Q7q16();
        Q7q16 wi5 = new Q7q16();
        Q7q16 wi6 = new Q7q16();
        wi1.i=10;
        wi2.i=20;
        System.out.println(i);
        wi1.method();
        wi2.method();
        wi3.method();
        wi4.method();
        wi5.method();
        wi6.method();

    }
    public void method(){
        while (++i < 3) {
            System.out.print("A");
        }
    }

}
