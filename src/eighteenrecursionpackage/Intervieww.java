package eighteenrecursionpackage;
    import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
    public class Intervieww {
        public static void main(String[] args) {

            System.out.println();
        }

        public static List<Integer> findCompletePrefixes(List<String> names, List<String> query) {

            List<Integer> result = new ArrayList<>();
            int arr[] = new int[query.size()];
            for(int i = 0; i<query.size(); i++){
                int counter = 0;
                for(int j =0; j<names.size();j++){
                    if(names.get(j).contains(query.get(i))){
                        counter++;
                    }
                }
                arr[i] = counter;
            }
            for(int k = 0; k<arr.length; k++){
                result.add(arr[k]);
            }

        return result;
    }
}
