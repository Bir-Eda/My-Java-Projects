package twelveinterfacepackage;

public class Book extends Document {
    private String title;

    public Book(String[] authors, String date, String tital) {
        super(authors, date);
        this.title = tital;
    }

    public String getTital() {
        return title;
    }
}
