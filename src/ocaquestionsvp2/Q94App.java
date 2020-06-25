package ocaquestionsvp2;

public class Q94App {
    String myStr="7007";
    public void doStuff(String str){
        int myNum=0;
        try{
            String myStr=str;
             myNum = Integer.parseInt(myStr);
        }
        catch (NumberFormatException ne){
            System.out.println("Error");
        }
        System.out.println("myStr: "+myStr + ", myNum: "+myNum);
    }

    public static void main(String[] args) {
        Q94App obj=new Q94App();
        obj.doStuff("9009");

    }
}
