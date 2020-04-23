package fifteenlinkedllistHashMappackage;
import java.util.HashMap;
public class FindingRepeatingWordsSecond {
    public static void main(String[] args) {
        String a="abc";
        a=a.toUpperCase();
        System.out.println(a);

        String sentence= "the best way to understand java is the practice java using java";
        findDuplicates(sentence);
    }
    public static void findDuplicates(String sentence){
        sentence=sentence.toUpperCase(); // convert all chars to upper
        String []words = sentence.split(" "); // convert to string array (1 word in each element)
        // find the frequencies of the words
        HashMap<String,Integer> wordCounts= new HashMap<>();
        for(String word: words){
            if(wordCounts.containsKey(word)){
                wordCounts.put(word, wordCounts.get(word)+1);
            }
            else{
                wordCounts.put(word, 1);
            }
        }
        System.out.println("REPEATING WORDS");
        for(String key : wordCounts.keySet()){
            if(wordCounts.get(key)>1){
                System.out.println(" --- "+key+" = \t"+wordCounts.get(key));
            }
        }

    }
}
