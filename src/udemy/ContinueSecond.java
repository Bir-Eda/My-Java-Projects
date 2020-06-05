package udemy;

public class ContinueSecond {
    public static void main(String[] args) {
        int i=0;
        while(i<10){
            if(i==3 || i==5){
                i++;  // infinitiveden kurtarir
            continue;
            }
            System.out.println(i);    // infinitive
            i++;
        }
    }
}
