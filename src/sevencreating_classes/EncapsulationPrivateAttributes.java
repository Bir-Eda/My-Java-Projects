package sevencreating_classes;

public class EncapsulationPrivateAttributes {
    private String name;
    private int number;
    private double num;
    EncapsulationPrivateAttributes(String name, int number, double num){
        this.name=name;
        this.number=number;
        this.num=num;
    }

    public String getName(){
        return this.name;
    }
    public int getNumber(){
        return this.number;
    }
    public double getNum(){
        return this.num;
    }



}
