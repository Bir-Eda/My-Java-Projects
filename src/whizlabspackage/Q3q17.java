package whizlabspackage;

public class Q3q17 {
    public static void main(String[] args) {
        final int x=0;
         int y=2;
       final int i=x;
        switch(x){  // final modifieri switch icinde kullanabiliyoruz ve buna compile time constant diyoruz

            case i+1:
                System.out.println();
        }
    }
}
