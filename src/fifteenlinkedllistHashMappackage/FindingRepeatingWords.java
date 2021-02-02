package fifteenlinkedllistHashMappackage;
import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;

public class FindingRepeatingWords {
    public static void main(String[] args) {
        String sentence="The best way to understand java is the practice java using java";
        sentence=sentence.toLowerCase();
        String[] words=(sentence.split(" "));  // her bir kelimeyi ayri ayri yazsin
        int count = 0;
        HashMap<String,Integer> repeat= new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count = count + 1;
                }
            }
            repeat.put(words[i] ,count);
            count = 0;
        }
        System.out.println(repeat);
        System.out.println("***************************");

        String s="The java is the practice java using java";
        System.out.println(vote(s));
    }

    public static HashMap<String, Integer> vote(String sentence){
        sentence=sentence.toLowerCase();
        String[] words=(sentence.split(" "));  // her bir kelimeyi ayri ayri yazsin
        int count = 0;
        HashMap<String,Integer> repeat= new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    count = count + 1;
                }
            }
            repeat.put(words[i] ,count);
            count = 0;
        }

        return repeat;
    }

    }


