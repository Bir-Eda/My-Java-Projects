package homeworkpackage;
//Write a method to calculate Number of letters in a String (Space and numbers excluded)
public class NumberOfLetters {
    public static void main(String[] args) {
        findNumOfLetter("Goodmorning Eda123**bir");
    }
    public static void findNumOfLetter(String word){
        int counter=0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i)<=122 && word.charAt(i)>=97 || word.charAt(i)<=90 && word.charAt(i)>=65){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
