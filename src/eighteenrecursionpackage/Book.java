package eighteenrecursionpackage;

public class Book {
   private int page;
   private String author;
   private String title;

    public Book(int page, String author, String title) {
        this.page = page;
        this.author = author;
        this.title = title;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
