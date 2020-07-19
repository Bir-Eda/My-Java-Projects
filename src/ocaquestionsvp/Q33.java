package ocaquestionsvp;

public class Q33 {
    public static void main(String[] args) {
        int x = 6;
        while (isAvailable(x)) {
            System.out.print(--x);
              // x--;     // (insert x--)
        }
    }

    public static boolean isAvailable(int y){
       // return  y-- >0 ? true : false;
        return  --y >0 ? true : false;
    }
}
