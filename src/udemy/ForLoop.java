package udemy;

public class ForLoop {
    public static void main(String[] args) {
        int i=0;
        int j=10;
        for(; i<10 && j>0; i++, j--){
            System.out.println("i = "+i);
            System.out.println("j = "+j);
        }
    }
}
