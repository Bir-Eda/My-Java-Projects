package fourthloopspackage;

public class DoWhileEx {
    public static void main(String[] args) {
        int counter =1;

        do{
            System.out.println(counter);
            counter++;
        }
        while(counter<=20);
        System.out.println("------------------------");

        int n=1;
        do{
            n++;
            System.out.println("n :"+ n + "\tn*2:" + n*2);

        }while(n<21);
    }
}
