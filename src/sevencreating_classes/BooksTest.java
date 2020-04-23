package sevencreating_classes;

public class BooksTest {
    public static void main(String[] args) {
        Books myObj=new Books("War and Peace", "Tolstoy","0123456", 200,true, "","" );
        System.out.println(myObj.toString());
        myObj.borrowBook("3/18/2020");
        System.out.println(myObj.getBorrowDate());
        System.out.println(myObj.isAvailibility());
        myObj.borrowBook("3/18/2020");
        myObj.returnBook("3/18/2020");
        System.out.println(myObj.isAvailibility());
    }

}
