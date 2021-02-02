package interview_questions.overloading_overriding;

import java.util.ArrayList;
import java.util.List;

public class Distrinct {
    public static void main(String[] args) {
        String word="madam";
        String word2="my name is granar";
        String word3="my name is esra";
      //  System.out.println(distinctLetter(word, "a"));
      //  System.out.println(distinctLetter(word2));
       // System.out.println(distinctLetter(word2,'a'));
    }


    public static int distinctLetter(String input1, String input2){
     
        List<Character> space=new ArrayList<>();
        for (int i=0; i<input1.length(); i++){
            if(input1.charAt(i)!=32) {
                space.add(input1.charAt(i));
            }
        }
        List<Integer>list=new ArrayList<>();
        for(int i=0; i<space.size(); i++){
           // if(space.get(i)==input2){
                list.add(i);
            }

        return list.get(1)-list.get(0);
    }

    String str=new String("abc");
    String str2=new String("abc");
     //assertNotSame(str1, str2);


}
