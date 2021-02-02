package interview_questions;

import java.util.HashMap;

public class VoteQuestion {

    public static void main(String[] args) {
        String sentence = "Java is java but python is not java";
        sentence=sentence.toLowerCase();
        String[] words= sentence.split(" ");
        HashMap<String, Integer> repeat=new HashMap<>();
        int count=0;
        for (int i = 0; i <words.length ; i++) {
            for (int j = 0; j <words.length ; j++) {
                if(words[i].equals(words[j])){
                    count=count+1;
                }
            }
            repeat.put(words[i], count);
            count=0;
        }
        System.out.println(repeat);


        int max=0;
        String winner=" ";
        for(String elements: repeat.keySet()){
            if(repeat.get(elements)>max){
                max=repeat.get(elements);
                winner=elements;
            }
        }
        System.out.println(winner+ " has votes: "+max);
    }
}
