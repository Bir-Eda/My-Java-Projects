package ocaquestionsvp;

import org.w3c.dom.ls.LSOutput;

interface Q25Downloadable {
    public void download();
}
interface Readable extends Q25Downloadable{
    public void readBook();

}
 abstract class Book implements Readable {

    public void readBook() {
            System.out.println("Read");

    }

//    class EBook extends Book {
//        public void readBook() {
//            System.out.println("Read E-Book");
//        }
//    }
}


