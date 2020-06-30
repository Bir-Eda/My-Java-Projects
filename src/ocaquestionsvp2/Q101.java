package ocaquestionsvp2;
abstract class Q101 {
    protected void revolve(){

    }
        abstract void rotate(); // abstract i default goruyor o yuzden protected i kabul eder

} // butun interface metodlar publictir
class Earth extends Q101{

    public void revolve() {  // public veya protected yapmaliyiz
    }
      void rotate(){  // default, protected ve public olabilir

     }
}

