package twentyonequeuepackage;

import java.io.File;
import java.io.IOException;

public class FileTxtHomework {
    public static void main(String[] args) {
        try {
            File myFile = new File("data.txt");
            if (myFile.createNewFile()) {
                System.out.println("File created " + myFile);
            } else {
                System.out.println("File already exist");
            }

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
