package sixteeniteratorpackage;
import java.util.HashSet;
public class HashSetFindInteger {
    public static void main(String[] args) {
        int myNum=123456765;
        System.out.println(myNum);
    }
    public static void findUnique(int num) {
        String str = "";
        str += num;
        HashSet<Character> mySet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            mySet.add(str.charAt(i));

        }
        if(str.length()==mySet.size()){
            System.out.println("All characters are unique");
        }
        else{
            System.out.println("Not Unique");
        }
    }

}

