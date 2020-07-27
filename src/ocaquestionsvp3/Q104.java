package ocaquestionsvp3;

import java.util.ArrayList;

public class Q104 {
    public static void main(String[] args) {
        ArrayList myList= new ArrayList();
        String[] myArray;
       // int num=0;
        try{
            while(true){
           // while(num/0>5){  // whilein ici false olursa bir alt satiri gormez
               // myList.add("My String");
              //  num++;

            }
        }
        catch(RuntimeException re){  // runtimeexception alttaki catch de yazsaydi hata verecekti. child parenten altinda olmaz
            System.out.println("Caught a RunExcep");
        }
        catch(Exception e){
            System.out.println("Caught an Excep");
        }
        System.out.println("Ready to use");
    }
}
