package twentyonequeuepackage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadingFirst {
    public static void main(String[] args)  {
        try {
            File myFile = new File("first.txt");
            Scanner scan = new Scanner(myFile);
            while (scan.hasNext()) {
                System.out.println(scan.nextLine());
            }

        } catch (Exception e) {
            System.out.println("oops");
            e.printStackTrace();
        }
    }
}
