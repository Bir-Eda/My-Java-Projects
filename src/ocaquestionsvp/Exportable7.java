package ocaquestionsvp;

public interface Exportable7 {
    Void export();
}

 /*class Tool implements Exportable7{
    protected void export(){
        System.out.println("Tool::export");
    }
}
class ReportTool extends Tool implements Exportable7{
    public void export(){
        System.out.println("RToll::export");
    }

    public static void main(String[] args) {
        Tool aTool=new ReportTool();
        Tool bTool=new Tool();
        callExport(aTool);
        callExport(bTool);
    }
    public static void callExport(Exportable ex){
        ex.export();
    }
}
 */