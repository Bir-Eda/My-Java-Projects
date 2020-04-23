package fourthloopspackage;

public class Vowels {
    public static void main(String[] args) {
        String a="Java is fun";
        for(int i=0;i<=10; i++){
            System.out.print(a.charAt(i)+"\t");

            if(a.charAt(i)=='a' || a.charAt(i)=='i' || a.charAt(i)=='u'){
                System.out.println("Vowels :");

            }else{
                System.out.println("it is not vowels");
            }


        }
    }
}
