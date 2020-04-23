package fifteenlinkedllistHashMappackage;

import java.util.Arrays;

public class AnagramFindSortThird {
    public static void main(String[] args) {
    String word1= "abcd";
    String word2="dcab";
    char[] chars1= word1.toCharArray();
    char[] chars2= word1.toCharArray();
        Arrays.sort(chars1);
        //System.out.println(Arrays.toString(chars1));
        Arrays.sort(chars2);
       // System.out.println(Arrays.toString(chars2));
      // if(chars1.equals(chars2)){
        if(Arrays.equals(chars1,chars2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not");
        }

    }

}
