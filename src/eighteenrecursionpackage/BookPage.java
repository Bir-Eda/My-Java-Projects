package eighteenrecursionpackage;

import java.util.Comparator;

public class BookPage implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        //return b1.getPage().compareTo(b2.getPage());
        if(b1.getPage()==b2.getPage()){
            return 0;
        }
        else if(b1.getPage()>b2.getPage()){
            return 1;
        }
        else {
            return -1;
        }
    }

}

