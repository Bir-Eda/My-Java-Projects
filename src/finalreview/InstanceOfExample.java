package finalreview;

import java.util.ArrayList;
import java.util.List;

public class InstanceOfExample {
    public static void main(String[] args) {
        List<Pen> list = new ArrayList<>();
        list.add(new Pen());
        list.add(new Crayola());
        list.add(new Pen());

        list.forEach(element -> {
            if (element instanceof Crayola) {
                ((Crayola) element).draw();
            } else {
                element.write();
            }
        });
    }
        }



class Pen{
    void write(){
        System.out.println("Writing");
    }
}

class Crayola extends Pen{
    void  draw(){
        System.out.println("Drawing");
    }
}
