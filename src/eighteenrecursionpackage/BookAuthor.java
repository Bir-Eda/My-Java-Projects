package eighteenrecursionpackage;

import java.util.Comparator;

public class BookAuthor implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getAuthor().compareTo(b2.getAuthor());
    }

}