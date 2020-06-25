package ocaquestionsvp2;

public class Q100 {
    public static void main(String[] args) {
        DVD dvd=new DVD(10,20);

    }
}
class CD{
    int r;

    public CD(int r) {
        this.r = r;
    }
}
class DVD extends CD{
    int c;

    public DVD(int r, int c) {
        super(r);
        this.c = c;
    }
}