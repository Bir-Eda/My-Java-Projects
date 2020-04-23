package fifthmethodpackage;

public class ClothRandom {
    public static void main(String[] args) {
        decideCloth();
    }
    public static void decideCloth(){
        int decision=(int)(Math.random()*3)+1;
        if(decision==1){
            System.out.println("Red shirt");
        }
        if(decision==2){
            System.out.println("Blue Jean");
        }

    }
}
