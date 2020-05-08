package twentyonequeuepackage;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JFCFileWriting {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("birsen.txt");
            myWriter.write("Java is super fun. It is even better\n");
            myWriter.write("Java is super fun. It is even better\n");
            myWriter.write("Java is super fun. It is even better\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Oops");
            e.printStackTrace();
        }
    }
}
