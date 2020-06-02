package whizlabspackage;

public class InstanceC {
      static int a=10; // static olsaydi jump gorecekti
    public void click(){  // static yoksa instance metodtur
        a=20;
    }
    public static void main(String[] args) {

    }
    public static void jump(){   // static method class metottur
        a=30;
    }
    public static void display(){

    }

}
