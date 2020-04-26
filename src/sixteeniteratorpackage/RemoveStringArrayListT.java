package sixteeniteratorpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class RemoveStringArrayListT {
    public static void main(String[] args) {
        List<String> myList=new ArrayList<>(Arrays.asList("java", "fun", "fun", "java", "happy", "java"));
        int counter=0;
        int index=0;
        for(int i=0; i<myList.size(); i++){
            System.out.print("Compare "+"\""+ myList.get(i)+"\" with : ");
            for(int j=i+1; j<myList.size(); j++){
                System.out.print(myList.get(j)+"\t");
                if(myList.get(i).equals(myList.get(j))){
                    //System.out.println(myList.get(j));
                    counter++;
                    if(counter==2) {
                        index = j;
                    }
                }
            }
            System.out.println();
        }
        System.out.println(index);
        myList.remove(index);
        System.out.println(myList);
    }

}