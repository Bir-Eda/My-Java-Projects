package fourthloopspackage;

public class WhileVsDoWhile {
    public static void main(String[] args) {
        do{
            System.out.println("we are in love with java");
        }
        while(false);
        boolean sentinal =true;
        while(sentinal){
            System.out.println("Nooo");
            sentinal=false;
        }
    }
}
