package eighteenrecursionpackage;

public class FirstRecursion {
    static int counter=0;
    public static void main(String[] args) {
        doIt();

    }
    public static void doIt(){
        counter++;
        if(counter<=5){

        System.out.println("Hello world");
        doIt();
    }
        }
        static void doThat(int count){
        if(count>0){
            System.out.println("Hello");
            doThat(count-1);
        }
        }
    }