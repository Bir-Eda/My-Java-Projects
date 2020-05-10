package twentyonequeuepackage;

import java.io.FileWriter;
import java.io.IOException;

public class FileWritingHomework {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("data.txt");
            myWriter.write("Product\t$ Price\tBrand\n");
            myWriter.write("---------------------------\n");
            myWriter.write("HandBag\t$80\tCalvin Clain\n");
            myWriter.write("Shoe\t$60\tGuess\n");
            myWriter.write("Tshirt\t$45\tTommy Hilfiger\n");
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Oops");
            e.printStackTrace();
        }
    }
}

