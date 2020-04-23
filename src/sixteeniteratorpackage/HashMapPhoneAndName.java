package sixteeniteratorpackage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class HashMapPhoneAndName {
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
        System.out.println(phoneBook);
        int numberOfQuestions=3;
        String query=" ";
        query=scan.nextLine();
        if(phoneBook.containsKey(query)){
            System.out.println(query+"="+phoneBook.get(query));
        }
        else{
            System.out.println("Not Found");
        }
        numberOfQuestions--;
    }
    }

