package twelveinterfacepackage;

public class EMail extends Document {
    private String subject;
    private String []to;

    public EMail(String[] authors, String date, String subject, String[] to) {
        super(authors, date);
        this.subject = subject;
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public String[] getTo() {
        return to;
    }
}
