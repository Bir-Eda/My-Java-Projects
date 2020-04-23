package twelveinterfacepackage;
import java.util.Arrays;
import java.util.Date;
abstract class Document {
    private String[] authors;
    private Date date;

    public Document(String[] authors, String date) {
        this.authors = authors;
        //this.date = date;
    }

    public String[] getAuthors() {
        return authors;
    }

    public void addAuthors(String[] authors) {
        this.authors = authors;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Document{" +
                "authors=" + Arrays.toString(authors) +
                ", date=" + date +
                '}';
    }
}

