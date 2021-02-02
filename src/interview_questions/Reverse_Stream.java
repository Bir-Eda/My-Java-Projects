package interview_questions;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Reverse_Stream {
    public static void main(String[] args) {
        String word="Birsen";
        System.out.println(revers(word));
        String name="Arif Berk";  // Stream String
        System.out.println(streamReverse(name));
        int n=10;
        System.out.println(sum(n));
        String s1="Ali";
        String s2="Ali";
        System.out.println(same(s1,s2));



    }
    public static String revers(String str){
        var result="";
        for(var i=str.length()-1; i>=0; i--){
            result+=str.charAt(i);
        }
        return result;
    }

    public static String streamReverse(String str){
        return Arrays.stream(str.split("")).reduce("",(x,y)->y+x);

    }
    public static int sum(int num){
        return IntStream.range(0,num).reduce(0,(x,y)->x+y); // 1+2+3+4=10
    }

    public static boolean same(String s1, String s2){
        return  Arrays.stream(s1.split("")).allMatch(x->s2.contains(x));
    }

}













