package ocaquestionsvp2;

import java.io.IOException;

public class Q85MyException extends RuntimeException{
    public static class Test{
        public static void main(String[] args) {
            try {
                method1();
            }catch(Q85MyException ne){
                    System.out.println("A");
                }
            }
        public static void method1(){
            try{
                throw Math.random()>0.5 ? new Q85MyException() : new RuntimeException();
            } // Math.random() numbers between 1-10
            catch(RuntimeException ie){
                System.out.println("B");
            }
//            public static void method1(){
//                try{
//                    throw 3>10 ? new Q85MyException() : new IOException();
//                }
//                catch(IOException ie){
//                    System.out.println("I");
//            }
//                catch(Exception re){
//                    System.out.println("B");
//                }
        }
    }


}
