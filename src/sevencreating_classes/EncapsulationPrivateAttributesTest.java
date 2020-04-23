package sevencreating_classes;

public class EncapsulationPrivateAttributesTest {
    public static void main(String[] args) {
        EncapsulationPrivateAttributes myObj = new EncapsulationPrivateAttributes("eda ", 12,  23.4);
        myObj.getName();
        myObj.getNum();
        myObj.getNumber();
        System.out.println(myObj.getName()+myObj.getNum()+myObj.getNumber());
    }
}
