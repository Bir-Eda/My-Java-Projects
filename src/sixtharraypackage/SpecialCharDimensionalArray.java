package sixtharraypackage;

public class SpecialCharDimensionalArray {
    public static void main(String[] args) {
        specialchar("Today is very fun");

    }
    public static void specialchar(String sentence){

        int counter=0;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)!='\0'|| sentence.charAt(i)!='\1'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
