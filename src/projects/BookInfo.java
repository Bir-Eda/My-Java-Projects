package projects;

import java.util.Scanner;

public class BookInfo {
    public static Book getBookInfo() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter title :");
        String title = scanner.next();
        System.out.println("Please enter Author :");
        String author = scanner.next();
        System.out.println("Please enter Publisher :");
        String publisher = scanner.next();
        System.out.println("Please enter number of pages :");
        int pages = scanner.nextInt();
        System.out.println("Please enter publish year :");
        int year = scanner.nextInt();


        Book newBook = new Book(title,author,publisher,pages,year);
        return newBook ;

    }


}
