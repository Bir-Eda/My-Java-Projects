package whizlabspackage;

import org.w3c.dom.ls.LSOutput;

public class Q6q2 {
    public int i;  // if is static just print AA
    public static void main(String[] args) {
        Q6q2 wi1=new  Q6q2();
        Q6q2  wi2=new Q6q2();
        Q6q2  wi3=new Q6q2();
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