package reviewpackage;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListCreate {
    public static void main(String[] args) {
       ArrayList<String> list = new ArrayList<String>(Arrays.asList("ali","veli", "ali", "osm","neni","veli"));
       ArrayList<String> newList= new ArrayList<>();
       for(String names:list){
           if(!newList.contains(names)){
               newList.add(names);
           }
       }
        System.out.println(newList);

    }
}