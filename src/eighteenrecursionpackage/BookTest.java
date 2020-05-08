package eighteenrecursionpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookTest {
    public static void main(String[] args) {
        List<Book> books=new ArrayList<>(10);
        books.add(new Book(300, "William Shakespare", "Romeo"));
        books.add(new Book(200,"James", "name"));
        books.add(new Book(160,"Kaplan", "Symite"));
        Collections.sort(books,new BookTitle());
        for(Book book:books){
            System.out.println(book.getPage()+"\t"+book.getAuthor()+"\t"+book.getTitle());
        }
        System.out.println("------------------");

        /*Collections.sort(books,new AuthorSort());
        Iterator<Book> iter = books.iterator();
        Book temp;
        while(iter.hasNext()){
            temp = iter.next();

        */
        Collections.sort(books,new BookAuthor());
        for(Book book:books){
            System.out.println(book.getPage()+"\t"+book.getAuthor()+"\t"+book.getTitle());
        }
        System.out.println("-------------------");
        Collections.sort(books,new BookPage());
        for(Book book:books){
            System.out.println(book.getPage()+"\t"+book.getAuthor()+"\t"+book.getTitle());
        }
    }


}


