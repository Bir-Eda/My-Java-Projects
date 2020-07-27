package ocaquestionsvp3;

public interface Q142Interface {
    public void readBook();
    public void setBookMark();

}
abstract class Book implements Q142Interface{
    public void readBook(){
        System.out.println("A");
    }

}
class EBook extends Book{
    public void readBook(){
        System.out.println("C");
    }
    public void setBookMark(){ }

    public static void main(String[] args) {
        Book book1=new EBook();
        book1.readBook();
    }
}
