package ocaquestionsvp;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Q6ClassTest {
    public static void main(String[] args) throws Exception{
        X xobj=new X();
        xobj.printFileContent();
    }
    public void printFileContent()throws IOException{
        throw new FileNotFoundException();
    }
}
