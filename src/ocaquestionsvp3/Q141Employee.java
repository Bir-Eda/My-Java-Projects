package ocaquestionsvp3;

public class Q141Employee {
    String name;
    boolean contract;
    double salary;
    Q141Employee(){
        name="Joe";
        this.name="Joe";
        this.name=new String ("Joe");
        this.contract=new Boolean(true);
        this.salary= new Double(100);


    }
    public String toString(){
        return name+ ":"+contract+":"+salary;
    }

    public static void main(String[] args) {
        Q141Employee e=new Q141Employee();

        e.name="Joe";
        e.contract=true;
        e.salary=100;
        System.out.println(e);
    }
}
