package ocaquestionsvp;

 interface Q7Exportable {
      void export();  // public abstract void export(),  gorunmeyen bir abstract vardir


//class Tool1 implements Q7Exportable{
//    protected public void export(){  // protected olunca daraltmis oluyoruz
//         System.out.println("Tool::Ex");
//     }
//}
//class ReportTool extends Tool implements Q7Exportable{
//     public void export(){
//         System.out.println("RTool::export");
//     }

    public static void main(String[] args) {
        Tool aTool=new ReportTool();
        Tool bTool=new Tool();
        callExport(aTool);
        callExport(bTool);

    }
    public static void callExport(Exportable7 ex){
         ex.export();
    }
}