package ocaquestionsvp3;

import java.util.ArrayList;

public class Q104 {
    public static void main(String[] args) {
        ArrayList myList= new ArrayList();
        String[] myArray;
        try{
            while(true){
                myList.add("My String");

            }
        }
        catch(RuntimeException re){
            System.out.println("Caught a RunExcep");
        }
        catch(Exception e){
            System.out.println("Caught an Excep");
        }
        System.out.println("Ready to use");
    }
}
