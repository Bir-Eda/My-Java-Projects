package ocaquestionsvp2;


interface Q96Exportable {
    void export();
}
class Tool implements Q96Exportable{
    public void export(){
        System.out.println("Tool::export");
    }
}
class ReportTool extends Tool{
   public void export(){   //public koymazsak kizartir
        System.out.println("RTool::export");
    }

    public static void main(String[] args) {
        Tool aTool=new ReportTool();
        Tool bTool=new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Q96Exportable ex){
        ex.export();
    }
}