package sixteeniteratorpackage;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapPhoneAndNameSecond {
    public static void main(String[] args) {
        HashMap<String, Integer> phoneBook = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        String name;
        int number;
        for (int i = 0; i < 3; i++) {
            System.out.println("Name ? ");
            name = scan.next();
            System.out.println("Phone number ? ");
            number = scan.nextInt();
            phoneBook.put(name, number);
        }
        //System.out.println(phoneBook);
        String nameToFind;
        for(int i=0; i<3; i++){
            System.out.println("Which name ? ");
            nameToFind= scan.next();
            if(phoneBook.containsKey((nameToFind))){
                System.out.println(nameToFind+"="+phoneBook.get(nameToFind));
            }
            else{
                System.out.println("Not found");
            }
        }
    }
}
