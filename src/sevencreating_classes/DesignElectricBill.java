package sevencreating_classes;

public class DesignElectricBill {
    int memberId;
    int counter;
    String memberName;
    double billAmount;
    public DesignElectricBill(int memberId,int counter, String memberName,double billAmount){
        this.billAmount= billAmount;
        this.counter=counter;
        this.memberId=memberId;
        this.memberName=memberName;
    }
    public void displayBill(){
        this.billAmount=this.counter*1.9;
        System.out.println(this.billAmount);
    }
    public void readCounter(){
        System.out.println(this.counter);
    }
    public void addConsumption(int consumption){
        this.counter+=consumption;
    }

    @Override
    public String toString() {
        return "DesignElectricBill{" +
                "memberId=" + memberId +
                ", counter=" + counter +
                ", memberName='" + memberName + '\'' +
                ", billAmount=" + billAmount +
                '}';
    }
}
