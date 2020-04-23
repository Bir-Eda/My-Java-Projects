package fourteenarraylistpackage;
import java.util.ArrayList;
import java.util.Arrays;
// write a java prog. to convert to array to ArrayList
public class ConvertStringArrayListToStrListT {
    public static void main(String[] args) {

        ArrayList<String> arrList = new ArrayList<>(Arrays.asList("abc", "hfhfg","idkdh","jshdgd"));
        String []arr = convertToStringArray(arrList);
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static String [] convertToStringArray(ArrayList<String> arr){
        String []arrStr =new String [arr.size()];
        for(int i=0; i< arrStr.length; i++){
            arrStr [i]=arr.get(i);
        }
        return arrStr;

    }
}
