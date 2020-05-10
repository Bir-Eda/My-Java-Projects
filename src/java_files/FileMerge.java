package java_files;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileMerge {
    public static void main(String[] args) throws Exception {
        Scanner scannerA = new Scanner(new File("src/java_files/a.txt"));
        Scanner scannerB = new Scanner(new File("src/java_files/b.txt"));
        String contentA="";
        String contentB="";
        while (scannerA.hasNext()){
            contentA+=scannerA.nextLine();
        }
        scannerA.close();
        while (scannerB.hasNext()){
            contentB+=scannerB.nextLine();
        }
        scannerB.close();
        FileWriter writer = new FileWriter("src/java_files/c.txt");
        writer.write(contentA+"\n"+contentB);
        writer.close();

    }
}
