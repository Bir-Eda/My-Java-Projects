package ocaquestionsvp2;
// import clothing.Shirt;   or
// import static clothing.Shirt.getcolor;
public class Q75 {
    public static String getColor(){
        return "Green";
    }
}

class Jeans{
  public void matchShirt(){

     //  String color=Shirt.getColor(); or String color=getColor();
          System.out.println("Fit");
     // }
  }

    public static void main(String[] args) {
        Jeans trouser=new Jeans();
        trouser.matchShirt();
    }
}
