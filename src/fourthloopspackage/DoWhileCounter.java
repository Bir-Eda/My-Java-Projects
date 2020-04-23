package fourthloopspackage;

public class DoWhileCounter {
    public static void main(String[] args) {
        int counter = 10; //int counter=0; olursa counteri on a kadar yazdirir
        do{
            System.out.println("counter ;"+counter);
            counter++;
        }

        while(counter<=10);

        System.out.println("-----------");
        System.out.println("with while loop");

        int counter2=10;
        while(counter2<=10){
            System.out.println(counter2);;
            counter2++;
        }

    }
}
