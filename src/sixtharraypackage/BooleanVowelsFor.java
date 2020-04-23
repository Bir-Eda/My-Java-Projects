package sixtharraypackage;

public class BooleanVowelsFor {
    public static void main(String[] args) {
        String word="love java";
        int counter=0;
        word=word.toLowerCase();
        for(int i=0; i<word.length(); i++){
            char letter=word.charAt(i);
            boolean check=letter=='a'||
                    letter=='e'||
                    letter=='a'||
                    letter=='o';
            if(check){
                counter++;
            }
        }
        System.out.println("Toatl "+ counter+" vowels");
    }
}
