package sixtharraypackage;

public class NumberOfWordsLines {
    public static void numberOfWords(String sentence) {
        int counter = 1;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ') {
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void numberOfLines(String words){
        int counter= 0;
        for (int i = 0; i <words.length(); i++){
            if(words.charAt(i)== '\n'){
                counter++;
            }
        }
        System.out.print(counter);
    }
    public static int countNumberoOfLines(char[]fileArray) {
        int numberOfLines = 1;
        for (int i=0; i<fileArray.length; i++) {
            if (fileArray[i] == '\0') {
                numberOfLines++;
            }

        }
        return numberOfLines;
    }
    public static void main(String[] args) {
        numberOfWords("Happy woman day");
        numberOfLines("Happy woman day 8 March");
        //System.out.println(countNumberoOfLines(fileArray));
    }
}
