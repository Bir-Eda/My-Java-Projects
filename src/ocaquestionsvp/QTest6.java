package ocaquestionsvp;

import java.io.IOException;

    class X {
        public void printFileContent()throws IOException {

            throw new IOException();
        }
    }
    public class QTest6{
        public static void main(String[] args) throws Exception{
            X x=new X();
            x.printFileContent();
        }
    }