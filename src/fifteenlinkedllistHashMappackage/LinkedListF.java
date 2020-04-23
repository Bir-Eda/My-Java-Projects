package fifteenlinkedllistHashMappackage;
import java.util.LinkedList;
import java.util.Arrays;
public class LinkedListF {
    public static void main(String[] args) {
        LinkedList<String>myList=new LinkedList<>(Arrays.asList("Java", "is","always","fun"));

        /*myList.add{"java");
        myList.add{"is");
        myList.add{"love");
        myList.add{"if");
        myList.add{"you");
        myList.add{"want");
        findLongest(myList);*/
            int longest=0;
            int index=0;

            for(int i=0; i<myList.size(); i++){
                if(myList.get(i).length()>longest){
                    longest=myList.get(i).length();
                    index=i;
                    System.out.println(myList.get(i));
                }
            }
            System.out.println("The longest word is : "+myList.get(index));
            findShortestWord(myList);
}
public static void findShortestWord(LinkedList<String>arr){
        int shortest=arr.get(0).length();
        String shortestWord="";
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).length()<shortest){
                shortest=arr.get(i).length();
                shortestWord=arr.get(i);
            }
        }
    System.out.println("The shortest word is :"+shortestWord);
}
}