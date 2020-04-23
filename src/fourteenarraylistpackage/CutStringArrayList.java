package fourteenarraylistpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class CutStringArrayList {
        public static void main(String[] args) {
            ArrayList<String> arr = new ArrayList<String>(Arrays.asList("aab", "bba", "cna", "ana", "bns"));
            ArrayList<String> half = new ArrayList<>();
            ArrayList<String> half2 = new ArrayList<>();
            for(int i=0; i<arr.size()/2+1; i++){
                half.add(arr.get(i));
            }
            ArrayList<String> half1 = new ArrayList<>();
           // ArrayList<String> half2 = new ArrayList<>();
            int stringHalf = arr.size()/2;
            for(int i=0 ; i<stringHalf ; i++){
                half1.add(arr.get(i));
            }
            for(int i=stringHalf ; i < arr.size() ; i++){
                half2.add(arr.get(i));
            }
            System.out.println(half1 + " - "+half2);
        }
        }



