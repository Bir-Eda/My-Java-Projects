package ocaquestionsvp4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Q174Test {
    public static void checkAge(List<Q174>list, Predicate<Q174>predicate){
        for (Q174 p:list){
            if(predicate.test((p))){
                System.out.println(p.name+" ");
            }
        }
    }

    public static void main(String[] args) {
        List<Q174>ilist= Arrays.asList(new Q174("Hank",45),
        new Q174("Charly", 40),
                new Q174("Sam", 38));
    }

}
