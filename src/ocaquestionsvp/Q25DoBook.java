package ocaquestionsvp;

abstract class Q25DoBook  implements Q25DReadable{
    public void readBook(){
        System.out.println("Read Book");
    }
}
abstract class Ebook extends Q25DoBook {
    public void readBook() {
        System.out.println("Read E-Book");
       
    }
}

