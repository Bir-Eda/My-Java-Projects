package fourteenarraylistpackage;
import java.util.ArrayList;
public class ArrayListNumberToThousand {
    public static void main(String[] args) {
        ArrayList<Integer>numbers =new ArrayList<Integer>();
        for(int i=1; i<=1000; i++){
            numbers.add(i);
        }
        //System.out.println(numbers);
        for(int num: numbers){
            System.out.println(num);
        }
    }
}
