package eighteenrecursionpackage;

import java.util.Comparator;
import java.util.Collection;
public class BookTitle implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.getTitle().compareTo(b2.getTitle());

    }
}