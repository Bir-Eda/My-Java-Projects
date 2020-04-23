package sevencreating_classes;

public class PChildTest {
    public static void main(String[] args) {
        PChild myChild= new PChild(10,20);
        System.out.println(myChild.getX());
        myChild.setX(45);
        System.out.println(myChild.getX());
    }
}
