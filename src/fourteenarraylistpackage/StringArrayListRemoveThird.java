package fourteenarraylistpackage;
import java.util.ArrayList;
import java.util.Arrays;
public class StringArrayListRemoveThird {
        public static void main(String[] args) {
            ArrayList myArr = new ArrayList<>(Arrays.asList("abc","sdf","fgh","evt"));
            removeStr(myArr);
        }
        public static void removeStr(ArrayList<String> arr) {
            System.out.println("Input Array : "+arr); //display input array
            for (int i = 0; i <arr.size() ; i++) {
                if(arr.get(i).contains("a") || arr.get(i).contains("e") || arr.get(i).contains("i")) {
                    arr.remove(i);
                }
            }
            System.out.println("Output Array : "+arr); //display output array
    }
}
