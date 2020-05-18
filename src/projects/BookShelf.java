package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.io.IOException;
public class BookShelf {
    public static void main(String[] args) throws IOException{

        //Book book = new Book("aa","b","c",30,200);
        //System.out.println(book.lost);

        BookMenu bs=new BookMenu("Book Shelf", new ArrayList<>(Arrays.asList("Add new Book", "List Lost Books")));
        bs.displayMenu();

    }
}
