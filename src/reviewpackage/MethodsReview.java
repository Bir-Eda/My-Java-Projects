package reviewpackage;

public class MethodsReview {
    public static void main(String[] args) {
    capitalLetters("Today We Will Repeat Again Java");
    //capitalLetterNumber("Today Schools Holiday");
    }
    public static void capitalLetters(String sentence){
        int num=0;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)>=65 && sentence.charAt(i)<=90){
                num++;
            }
        }
        System.out.println(num);

    }
    /*public static int capitalLetterNumber(String sentence){
        int count = 0 ;
        for (int i = 0 ; i<sentence.length() ; i++){
            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z')
                count++;
        }
        return count;
    }*/
}
