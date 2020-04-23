package reviewpackage;

public class ImportReview {
    public static void main(String[] args) {
        String []arrayString= new String [5];
        for(int i=0; i<arrayString.length; i++){
            arrayString[i]=generateRandomWord();
        }
        for(String word:arrayString){
            System.out.println(word);
        }
    }
    public static String generateRandomWord(){
        String word="";
        int wordL= (int)(Math.random()*6+1);
        for(int i=0; i<wordL; i++){
            word+=(char)(int)(Math.random()*26+97);
        }
        return word;

    }
}
