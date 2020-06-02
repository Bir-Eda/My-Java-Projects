package whizlabspackage;

public class Q6q3 {
    public int i;  // if is static just print AA
    public static void main(String[] args) {
        Q6q3 wi1=new Q6q3();
        Q6q3 wi2=new Q6q3();
        Q6q3 wi3=new Q6q3();
        wi1.method();
        wi2.method();
        wi3.method();



    }
    public void method(){
        while(++i<3){
            System.out.print("A");
        }
    }
}