package ocaquestionsvp2;

public class Q89 {
    public static void main(String[] args) {
        int x=6;
        while(isAvailable(x)){
            System.out.println(--x); // soutun icine - -x yazilir ki 5 ten baslasin


        }
    }
    public static boolean isAvailable(int x){
        return --x>0 ? true : false;
    }
}
