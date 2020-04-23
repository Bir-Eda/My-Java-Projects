package sevencreating_classes;

public class Books {
    private String bookTitle;
    private String bookAutor;
    private String ISBN; // we assumed some ISBN numbers start with 0;
    private int numberOfPages;
    private boolean availibility;
    private String borrowDate;
    private String returnDate;

    Books(String bookTitle, String bookAutor, String ISBN, int numberOfPages, boolean availibility, String borrowDate, String returnDate) {
        this.bookTitle = bookTitle;
        this.bookAutor = bookAutor;
        this.ISBN = ISBN;
        this.numberOfPages = numberOfPages;
        this.availibility = availibility;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getBookAutor() {
        return bookAutor;
    }

    public void setBookAutor(String bookAutor) {
        this.bookAutor = bookAutor;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isAvailibility() {
        return availibility;
    }

    public void setAvailibility(boolean availibility) {
        this.availibility = availibility;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void borrowBook(String date) {
        if (this.availibility) {
            this.availibility = false;
            String arr[] = date.split("/");

            int month = Integer.parseInt(arr[0]);
            int day = Integer.parseInt(arr[1]);
            //int year=Integer.parseInt(arr[2]);
            if ((month > 0 && month < 13) && (day > 0 && day < 32)) {
                this.borrowDate = date;
            } else {
                System.out.println("Date is not correct");
            }
        } else {
            System.out.println("Book is not avaliable");
        }
    }



    public void returnBook(String date) {
        this.availibility = true;
        String[] dateArr =new String[3];
                dateArr=date.split("/");
        int month = Integer.parseInt(dateArr[0]);
        int day = Integer.parseInt(dateArr[1]);
        if ((month > 0 && month < 13) && (day > 0 && day < 32)){
    }
    else

    {
        System.out.println("Date is wrong");
    }

}

    @Override
    public String toString() {
        return "Books{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookAutor='" + bookAutor + '\'' +
                ", ISBN='" + ISBN + '\'' +
                ", numberOfPages=" + numberOfPages +
                ", availibility=" + availibility +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                '}';
    }
}
