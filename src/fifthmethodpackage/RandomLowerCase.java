package fifthmethodpackage;

public class RandomLowerCase {
    public static void ranNumb (){
        for (int i=1; i<=3; i++){
            System.out.print((char) (97+ (int) (Math.random() * 26)));
        }
    }
    public static void ranNum2(){
        for(int i=1; i<=3; i++){

            System.out.print((int)(Math.random()*10));
        }


    }

    public static void main(String[] args) {
        ranNumb();
        ranNum2();
    }
}
