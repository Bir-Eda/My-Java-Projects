package fifthmethodpackage;

public class ILoveJava {
    public static void loveJava(){
        String love="I love java";
        for(int i=love.length()-1; i>=0; i-- ){
            System.out.print(love.charAt(i));
        }
    }


    public static void main(String[] args) {
        loveJava();
    }
}
