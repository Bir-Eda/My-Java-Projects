package fifteenlinkedllistHashMappackage;
import java.util.Arrays;
import java.util.LinkedList;
public class FirstLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("Java","Is","always","super","Fun"));
        System.out.println(longestOne(list));

    /*  list.add("java");
        list.add("is");
        list.add("always");
        list.add("perfect");
        list.add("language");
        findLongestOne(list);

        */

    }
    public static String longestOne(LinkedList<String>list){  // return version
        int index=0;
         int size=0;
         for(int i=0; i<list.size(); i++){
             if(list.get(i).length()>size){
                 size=list.get(i).length();
                 index=i;
             }
         }
    return list.get(index);
    }
   /* public static void findLongestOne(LinkedList<String>arr){   // void version
       int max=0;
       String longest="";
       for(int i=0; i<arr.size(); i++){
       if(arr.get(i).length()>max;
       max=arr.get(i).length();
       longest=arr.get(i);

    }
    }
    System.out.println("longest element "+longest+"has"+max+"letters");
*/
}
