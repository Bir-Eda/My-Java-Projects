package fifteenlinkedllistHashMappackage;

import java.util.Arrays;

public class AnagramFind {
    public static void main(String[] args) {
        System.out.println(anagram("cat", "cate"));

    }

    public static boolean anagram(String word1, String word2) {
        boolean anagram= true;
        char []charArr1= word1.toLowerCase().toCharArray();
        char []charArr2= word1.toLowerCase().toCharArray();
        Arrays.sort(charArr1);
        Arrays.sort(charArr2);
        if(charArr1.length!=charArr2.length){
            anagram=false;
        }
        else{
            for(int i=0; i<charArr1.length; i++){
                if(charArr1[i]!=charArr2[i]){
                    anagram= false;
                }
            }
        }
        return anagram;
    }

}