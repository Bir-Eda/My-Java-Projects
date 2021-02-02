package sixtharraypackage;

public class FindNumOfElement {
    public static void main(String[] args) {
        String[] words = {"abc", "hsgdy", "hgdf", "ahs", "hf", "kdkddhf", "ks", "n"};
        int counter = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < 4) {  //length() length den sonra parantez String method yapiyor tipki Math.random() gibi
                counter++;  // it is counting how many words less than four lengths(4 harften daha az olanlari sayiyor)
                System.out.println(words[i]);
            }

        }
        System.out.println(counter);

    }
        public static void macSecond(String word []){
        int count=0;
        for( int i=0; i<word.length; i++){
            if(word[i].length()<6){
                count++;
            }


        }

    }
}
