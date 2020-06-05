package whizlabspackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Exception {
    static Integer i;
    public static void main(String[] args) {
       try{
           System.out.println(i.doubleValue());
       }
       catch(NullPointerException| ArithmeticException e){
           System.out.println(e.getClass().getSimpleName());
       }
    }
}
 // exceptinlarda || ve & kullanilmiyor. sadece | tek or kullanilir