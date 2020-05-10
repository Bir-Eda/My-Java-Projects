package twentyonequeuepackage;
import java.io.File;
import java.io.IOException;

public class FileClassMyOwn {
    public static void main(String[] args) {
        try{
            File my=new File("Birsen.txt");
            if(my.createNewFile()){
                System.out.println("File created "+my);

            }else{
                System.out.println("File already exists.");
            }
        }catch (IOException e){
            System.out.println("An error occured.");
        }
    }

}
