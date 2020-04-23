package sixteeniteratorpackage;
import java.util.HashMap;
import java.util.Scanner;
public class HashMapPhoneAndNameT {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many entries?");
        int n = scan.nextInt();
        HashMap<String, Integer> pb = new HashMap<>();
        String name;
        int phoneNumber;
        for (int i = 0; i < n; i++) {
            System.out.println("Name ? ");
            name = scan.next();
            System.out.println("Phone number ? ");
            phoneNumber = scan.nextInt();
            pb.put(name, phoneNumber);
        }

        int numberOfQuestions=3;
        String query=" ";
        while(numberOfQuestions>=0){
            System.out.println("enter ");
            query=scan.nextLine();
            if(pb.containsKey(query)){
                System.out.println(query+"="+pb.get(query));
            }
            else{
                System.out.println("Not Found");
            }
            numberOfQuestions--;
        }
    }
}
