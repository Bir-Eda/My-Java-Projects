package fifteenlinkedllistHashMappackage;

import java.util.Arrays;

public class AnagramFindSortThirdT {
    public static void main(String[] args) {
        String word1= "abcd";
        String word2= "dcab";
        char[] chars1= word1.toCharArray();
        char[] chars2= word1.toCharArray();
        Arrays.sort(chars1);
        System.out.println(Arrays.toString(chars1));
        Arrays.sort(chars2);
        System.out.println(Arrays.toString(chars2));
       boolean anagram=true;
       for(int i=0; i<chars1.length; i++){

        if(chars1[i]!=chars2[i]) {
            anagram=false;
            break;
        }
        }
        if(anagram){
            System.out.println("Anagram :");
        }
        else{
            System.out.println("Not anagram :");
        }
    }
}
