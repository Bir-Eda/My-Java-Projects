package ocaquestionsvp;

 interface Q7Exportable {
      void export();

}
class Tool1 implements Q7Exportable{
     public void export(){  // protected olunca daraltmis oluyoruz
         System.out.println("Tool::Ex");
     }
}
