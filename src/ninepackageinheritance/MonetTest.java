package ninepackageinheritance;

public class MonetTest {
    public static void main(String[] args) {
        System.out.println(Money.MachineSerial);
        Money hundred =new Money(100, 12345);
        System.out.println(hundred.serial);
        Money fifty =new Money(30, 98765);
        System.out.println(fifty.MachineSerial);
        System.out.println(fifty.serial);
    }
}
