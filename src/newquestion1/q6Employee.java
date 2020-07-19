package newquestion1;

public class q6Employee {
    String name;
    boolean contract;
    double salary;

    q6Employee(){
        this.name=new String ("Joe");
        this.contract=new Boolean(true);
        this.salary=new Double(100);

    }
    public String toString(){
        return name+":"+contract+":"+salary;

    }

    public static void main(String[] args) {
        q6Employee e=new q6Employee();
        e.name="Joe";
        e.contract=true;
        e.salary=100;
        System.out.println(e);


    }
}
