package sixtharraypackage;

public class Yigit {
    public static void main(String[] args) {
        String word = "yigit";
       int result=0;
        for (int i = 0; i <word.length(); i++) {
           result+=(int)(word.charAt(i));

        }
        System.out.println("char value of hello is "+result);

    }
}



